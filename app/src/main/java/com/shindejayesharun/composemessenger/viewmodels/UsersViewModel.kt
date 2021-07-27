package com.shindejayesharun.composemessenger.viewmodels

import android.provider.FontsContract
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shindejayesharun.composemessenger.data.UserApiService
import com.shindejayesharun.composemessenger.data.models.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class UsersViewModel: ViewModel() {
    private val apiService= UserApiService.create()

    private val _users by lazy {
            MutableStateFlow<List<User>>(listOf()).also { userFlow ->
                viewModelScope.launch {
                    userFlow.value = fetchUsers(20)
                }
            }
    }

    private suspend fun fetchUsers(count:Int):List<User>{
        val data = apiService.getUsers(count = count)
        return  data.results
    }
}
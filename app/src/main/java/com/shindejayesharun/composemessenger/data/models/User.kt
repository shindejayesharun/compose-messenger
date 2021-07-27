package com.shindejayesharun.composemessenger.data.models

import com.google.gson.annotations.SerializedName

data class UserDataWrapper(
    val info: Info,
    val results: List<User>
)

data class Info(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)

data class User(
    @SerializedName("phone") val id: String,
    val name: Name,
    val picture: Picture
)

data class Name(
    val first: String,
    val last: String
)

data class Picture(
    val large:String,
    val medium:String,
    val thumbnail:String
)

fun emptyUser() = User(id = "",name = Name(first = "",last = ""),picture = Picture(large = "",medium = "",thumbnail = ""))
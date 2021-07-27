package com.shindejayesharun.composemessenger.data

import com.shindejayesharun.composemessenger.data.models.Name
import com.shindejayesharun.composemessenger.data.models.Picture
import com.shindejayesharun.composemessenger.data.models.User

val me = User(
    id = "000-000-0000",
    name = Name(first = "Jayesh",last = "Shinde"),
    picture = Picture(
        thumbnail = "https://picsum.photos/id/1005/45/45",
        medium = "https://picsum.photos/id/1005/72/72",
        large = "https://picsum.photos/id/1005/128/128"
    )
)
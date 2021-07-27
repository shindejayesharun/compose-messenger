package com.shindejayesharun.composemessenger.data.models

import android.graphics.drawable.PictureDrawable
import androidx.compose.ui.unit.Dp

sealed class Message(
    val from: User,
    val reactions: ArrayList<Reaction>,
    val repliedTo: ReplyTo? = null
) {
    class Text(
        val message: String,
        from: User,
        reactions: ArrayList<Reaction> = arrayListOf(),
        repliedTo: ReplyTo? = null
    ) : Message(from, reactions, repliedTo)

    class Emoji(
        val id: String,
        val size: Dp,
        var shouldAnimate: Boolean,
        from: User,
        reactions: ArrayList<Reaction> = arrayListOf(),
        repliedTo: ReplyTo? = null
        ): Message(from,reactions,repliedTo)

    class Image(
        val id: String,
        val picture: PictureDrawable,
        from: User,
        reactions: ArrayList<Reaction> = arrayListOf(),
        repliedTo: ReplyTo? = null
    ): Message(from,reactions,repliedTo)

    class Video(
        val id: String,
        val url: String,
        from: User,
        reactions: ArrayList<Reaction> = arrayListOf(),
        repliedTo: ReplyTo? = null
    ): Message(from,reactions,repliedTo)
}

data class Reaction(val from: User, val id: String)
data class ReplyTo(val name: String, val message: Message)
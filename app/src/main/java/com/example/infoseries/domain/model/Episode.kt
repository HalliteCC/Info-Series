package com.example.infoseries.domain.model

import android.media.Image
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Episode(

    @SerializedName("showId")
    var serieId: Long,
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("number")
    val number: Int,
    @SerializedName("season")
    val season: Int,
    @SerializedName("image")
    val image: com.example.infoseries.domain.model.Image? = null,
    @SerializedName("summary")
    val summary: String,
) : Parcelable

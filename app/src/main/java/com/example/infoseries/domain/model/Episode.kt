package com.example.infoseries.domain.model

import android.media.Image
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class Episode (

    @SerializedName("showId")
    var serieId: Long,
    val id: Long,
    val name: String,
    val number: Int,
    val season: Int,
    val image: Image? = null,
    val summary: String,
    )
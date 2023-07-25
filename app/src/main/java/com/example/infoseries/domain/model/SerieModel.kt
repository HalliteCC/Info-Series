package com.example.infoseries.domain.model

import android.media.Image
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SerieModel(
    @SerializedName("id")
    val idSerie: Long,
    @SerializedName("name")
    val title: String,
    @SerializedName("genres")
    val genre: List<String> = listOf(),
    @SerializedName("language")
    val language: String,
    @SerializedName("premiered")
    val premiered: String,
    @SerializedName("id")
    val rating: Rating,
    @SerializedName("ended")
    val ended: String,
    @SerializedName("schedule")
    val schedule: ScheduleModel,
    @SerializedName("image")
    val cover: com.example.infoseries.domain.model.Image? = null,
    @SerializedName("summary")
    val summary: String
) : Parcelable

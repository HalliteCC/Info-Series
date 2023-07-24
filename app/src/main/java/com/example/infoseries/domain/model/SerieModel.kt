package com.example.infoseries.domain.model

import android.media.Image

data class SerieModel(
    val idSerie: Long,
    val title: String,
    val genre: List<String> = listOf(),
    val language: String,
    val premiered: String,
    val rating: Rating,
    val ended: String,
    val time: String,
    val day: String,
    val schedule: ScheduleModel,
    val cover: Image? = null,
    val summary: String
)

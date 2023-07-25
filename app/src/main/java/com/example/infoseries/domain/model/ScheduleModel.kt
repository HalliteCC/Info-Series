package com.example.infoseries.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ScheduleModel(
    val time: String,
    val days: String
): Parcelable
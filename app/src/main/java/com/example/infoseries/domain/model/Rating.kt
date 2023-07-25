package com.example.infoseries.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rating(
val average: Double
): Parcelable

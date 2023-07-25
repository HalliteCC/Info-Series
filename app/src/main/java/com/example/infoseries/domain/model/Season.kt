package com.example.infoseries.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Season(
    val id: Long,
    val number: Int
) : Parcelable
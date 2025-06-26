package com.example.kotlintraining

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val nome: String,
    val idade: Int,
    val nat: String
): Parcelable

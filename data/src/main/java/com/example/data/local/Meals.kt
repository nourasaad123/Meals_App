package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("meals")
data class Meals(
    @PrimaryKey
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)

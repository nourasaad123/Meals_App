package com.example.data.remote

import com.example.domain.domain.entity.CategoryResponse
import retrofit2.http.GET


interface ApiService {
    //www.themealdb.com/api/json/v1/1/categories.php -->base url
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse


}

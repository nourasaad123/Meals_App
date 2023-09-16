package com.example.domain.domain.repo

import com.example.domain.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote(): CategoryResponse
}
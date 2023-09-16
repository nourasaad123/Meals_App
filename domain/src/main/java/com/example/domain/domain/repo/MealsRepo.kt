package com.example.domain.domain.repo

import com.example.domain.domain.entity.CategoryResponse

interface MealsRepo {
   suspend fun getMealsFromRemote(): CategoryResponse
}
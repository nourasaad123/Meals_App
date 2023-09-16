package com.example.domain.domain.usecase

import com.example.domain.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}
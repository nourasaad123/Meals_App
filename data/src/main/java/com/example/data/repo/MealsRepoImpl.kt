package com.example.data.repo

import com.example.data.local.Meals
import com.example.data.local.MealsDatabase
import com.example.data.remote.ApiService
import com.example.domain.domain.entity.CategoryResponse
import com.example.domain.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
//private val db=MealsDatabase.getInstance().getDao()

    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()

/*    suspend fun insertRoom(meals:Meals) {
        if (this.getFavById(meals.idCategory) == null) {
           db.insert(meals)
        }
    }

  suspend fun deleteRoom(meals:Meals) {
        db.delete(meals)
    }

    suspend fun getFavById(id: String): Meals? =db.getFavById(id)
*/
}


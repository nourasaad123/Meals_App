package com.example.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MealsDao {
    @Query("SELECT * FROM meals")
   fun getAllMeals(): Flow<List<Meals>>

    @Insert
    suspend fun insert(meals: Meals)
    @Delete
    suspend fun delete(meals: Meals)

    @Query("DELETE FROM meals")
    suspend fun deleteAllMeals()

    @Query("select * from meals where idCategory =:id")
    suspend fun getFavById(id: String): Meals

}
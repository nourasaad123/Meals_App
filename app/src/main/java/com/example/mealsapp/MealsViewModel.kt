package com.example.mealsapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.local.Meals
import com.example.data.repo.MealsRepoImpl
import com.example.domain.domain.entity.CategoryResponse
import com.example.domain.domain.usecase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUseCase: GetMeals
) : ViewModel() {
    private val _categories: MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val categories: StateFlow<CategoryResponse?> = _categories
    fun getMeals() {
        viewModelScope.launch {
            try {
                _categories.value = getMealsUseCase()
            } catch (e: Exception) {
                Log.e("MealsViewModel", e.message.toString())
            }

        }
    }
    /*
    fun insertRoom(meals: Meals) {
        viewModelScope.launch {
          //  repository.insertRoom(meals)
        }
    }

    fun deleteRoom(meals:Meals) {
        viewModelScope.launch {
         //   repository.deleteRoom(meals)
        }
    }

     */
}

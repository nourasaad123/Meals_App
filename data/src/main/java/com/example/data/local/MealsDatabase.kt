package com.example.data.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Meals::class],
    version = 1,
)
abstract class MealsDatabase : RoomDatabase() {
    /*
    companion object {
        fun getInstance(): MealsDatabase {
            return Room.databaseBuilder(
                SharedObject.appContext,
              MealsDatabase::class.java, "mydataBase"
            ).build()
        }
    }
*/
    abstract fun getDao():MealsDao
}
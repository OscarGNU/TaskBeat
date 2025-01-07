package com.devspace.taskbeats

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.util.Locale.Category

@Dao
interface CategoryDao {
    @Query ("Select * From categoryentity")
       fun getAll(): List<CategoryEntity>

       @Insert(onConflict = OnConflictStrategy.REPLACE)
       fun insetAll(categoryEntity: List <CategoryEntity>)
}
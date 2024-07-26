package com.example.recipeapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.utils.Constants

@Entity(tableName = Constants.RECIPE_TABLE_NAME)
data class RecipeEntity(
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0,
    var response: ResponseRecipes
)
package com.example.recipeapp.data.database.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.utils.Constants

@Entity(tableName = Constants.FAVORITE_TABLE_NAME)
data class FavoriteEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val result: ResponseDetail
)

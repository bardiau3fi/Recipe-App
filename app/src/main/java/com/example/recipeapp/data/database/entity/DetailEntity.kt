package com.example.recipeapp.data.database.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.utils.Constants

@Entity(tableName = Constants.DETAIL_TABLE_NAME)
data class DetailEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val result: ResponseDetail
)

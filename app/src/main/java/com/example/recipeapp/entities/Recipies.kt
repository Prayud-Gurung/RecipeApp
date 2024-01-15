package com.example.recipeapp.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Recipes")
data class Recipies(
    @PrimaryKey(autoGenerate = true)
    val id:Int
) : java.io.Serializable
package com.example.resepkita.model

data class Recipe(
    val id: Int,
    val title: String,
    val description: String,
    val imageRes: Int,
    val ingredients: List<String>,
    val steps: List<String>,
    val category: String,
    val difficulty: String,
    val time: Int,
    val calories: Int,
    val author: String,
    val rating: Float,
    val favorite: Boolean,
    val cooked: Boolean
)

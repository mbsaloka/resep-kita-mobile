package com.example.resepkita.model

data class Recipe(
    val id: Int,
    val title: String,
    val imageRes: Int,
    val ingredients: List<String>,
    val steps: List<String>
)

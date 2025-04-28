package com.example.resepkita.ui.screen.category

import androidx.lifecycle.ViewModel
import com.example.resepkita.model.Recipe

class CategoryViewModel : ViewModel() {
    fun getCategories(recipes: List<Recipe>): List<String> {
        return recipes.map { it.category }.distinct()
    }

    fun getRecipesByCategory(recipes: List<Recipe>, category: String): List<Recipe> {
        return recipes.filter { it.category == category }
    }
}

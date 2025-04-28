package com.example.resepkita.ui.screen.detail

import androidx.lifecycle.ViewModel
import com.example.resepkita.model.Recipe
import com.example.resepkita.repository.RecipeRepository

class DetailViewModel : ViewModel() {
    fun getRecipeById(id: Int): Recipe? {
        return RecipeRepository.getRecipes().find { it.id == id }
    }
}

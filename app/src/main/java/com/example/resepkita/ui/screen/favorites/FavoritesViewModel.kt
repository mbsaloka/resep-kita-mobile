package com.example.resepkita.ui.screen.favorites

import androidx.lifecycle.ViewModel
import com.example.resepkita.model.Recipe
import com.example.resepkita.repository.RecipeRepository

class FavoritesViewModel : ViewModel() {
    val favorites: List<Recipe> = RecipeRepository.getRecipes().filter { it.favorite }
    val cooked: List<Recipe> = RecipeRepository.getRecipes().filter { it.cooked }
}

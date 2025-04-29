package com.example.resepkita.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.resepkita.model.Recipe
import com.example.resepkita.repository.RecipeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _allRecipes = MutableStateFlow<List<Recipe>>(emptyList())
    val allRecipes: StateFlow<List<Recipe>> = _allRecipes

    private val _filteredRecipes = MutableStateFlow<List<Recipe>>(emptyList())
    val filteredRecipes: StateFlow<List<Recipe>> = _filteredRecipes

    init {
        loadRecipes()
    }

    private fun loadRecipes() {
        viewModelScope.launch {
            val recipeList = RecipeRepository.getRecipes()
            _allRecipes.value = recipeList
            _filteredRecipes.value = recipeList
        }
    }

    fun searchRecipes(query: String) {
        _filteredRecipes.value = if (query.isBlank()) {
            _allRecipes.value
        } else {
            _allRecipes.value.filter { recipe ->
                recipe.title.contains(query, ignoreCase = true)
            }
        }
    }
}

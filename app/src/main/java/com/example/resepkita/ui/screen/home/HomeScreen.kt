package com.example.resepkita.ui.screen.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.resepkita.ui.components.RecipeItemCard
import com.example.resepkita.ui.theme.ResepKitaTheme

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = viewModel()
) {
    val recipes = viewModel.recipes.collectAsState(initial = emptyList())

    if (recipes.value.isEmpty()) {
        CircularProgressIndicator()
    } else {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(recipes.value) { recipe ->
                RecipeItemCard(recipe = recipe, onClick = {
                    navController.navigate("recipeDetail/${recipe.id}")
                })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ResepKitaTheme {
        HomeScreen(navController = rememberNavController())
    }
}

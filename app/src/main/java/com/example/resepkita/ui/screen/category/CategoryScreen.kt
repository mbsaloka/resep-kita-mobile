package com.example.resepkita.ui.screen.category

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.resepkita.model.Recipe
import com.example.resepkita.R
import com.example.resepkita.repository.RecipeRepository
import com.example.resepkita.ui.theme.ResepKitaTheme

@Composable
fun CategoryScreen(
    navController: NavController,
    viewModel: CategoryViewModel = CategoryViewModel(),
) {
    val recipes = RecipeRepository.getRecipes()
    val categories = viewModel.getCategories(recipes)

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Kategori Resep",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn {
            items(categories) { category ->
                CategoryItem(category = category, navController = navController, recipes = recipes)
            }
        }
    }
}

@Composable
fun CategoryItem(
    category: String,
    navController: NavController,
    recipes: List<Recipe>,
    viewModel: CategoryViewModel = CategoryViewModel(),
    modifier: Modifier = Modifier,
) {
    val recipesByCategory = viewModel.getRecipesByCategory(recipes, category)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navController.navigate("categoryRecipes/$category")
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.category_icon),
            contentDescription = category,
            modifier = Modifier.size(60.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = category,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    ResepKitaTheme {
        CategoryScreen(navController = rememberNavController())
    }
}

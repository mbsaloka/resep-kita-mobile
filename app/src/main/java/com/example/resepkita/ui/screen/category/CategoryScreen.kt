package com.example.resepkita.ui.screen.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.resepkita.model.Recipe
import com.example.resepkita.R
import com.example.resepkita.repository.RecipeRepository
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.resepkita.ui.theme.ResepKitaTheme

@Composable
fun CategoryScreen(
    navController: NavController,
    viewModel: CategoryViewModel = CategoryViewModel(),
) {
    val recipes = RecipeRepository.getRecipes()
    val categories = viewModel.getCategories(recipes)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Category", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categories.size) { index ->
                CategoryItem(category = categories[index], navController = navController, recipes = recipes)
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

    Column(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(12.dp))
        .background(Color.LightGray.copy(alpha = 0.5f))
        .clickable {
            navController.navigate("categoryRecipes/$category")
        }
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.category_icon),
                contentDescription = category,
                modifier = Modifier.padding(10.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = category, style = MaterialTheme.typography.titleMedium.copy(fontSize = 14.sp))
    }
}
@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    ResepKitaTheme {
        CategoryScreen(navController = rememberNavController())
    }
}

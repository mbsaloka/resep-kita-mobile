package com.example.resepkita.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.resepkita.ui.components.TopAppBarComponent
import com.example.resepkita.ui.screen.category.CategoryScreen
import com.example.resepkita.ui.screen.detail.DetailScreen
import com.example.resepkita.ui.screen.favorites.FavoritesScreen
import com.example.resepkita.ui.screen.home.HomeScreen
import com.example.resepkita.ui.screen.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBarComponent(
                title = "Resep Kita",
                onMenuClick = { /* todo add logic */ }
            )
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "splash",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("splash") {
                SplashScreen(navController = navController)
            }
            composable("home") {
                HomeScreen(navController = navController)
            }
            composable("category") {
                CategoryScreen(navController = navController)
            }
            composable("recipeDetail/{recipeId}") { backStackEntry ->
                val recipeId = backStackEntry.arguments?.getString("recipeId")?.toInt() ?: 0
                DetailScreen(recipeId = recipeId)
            }
            composable("favorites") {
                FavoritesScreen(navController = navController)
            }
        }
    }
}

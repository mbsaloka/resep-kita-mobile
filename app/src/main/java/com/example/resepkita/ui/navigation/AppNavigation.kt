package com.example.resepkita.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.resepkita.ui.screen.detail.DetailScreen
import com.example.resepkita.ui.screen.favorites.FavoritesScreen
import com.example.resepkita.ui.screen.home.HomeScreen
import com.example.resepkita.ui.screen.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold { paddingValues ->
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
            composable(
                "recipeDetail/{recipeId}",
                arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
            ) { backStackEntry ->
                val recipeId = backStackEntry.arguments?.getInt("recipeId") ?: 0
                DetailScreen(
                    recipeId = recipeId,
                    onBackClick = { navController.popBackStack() }
                )
            }
            composable("favorites") {
                FavoritesScreen(navController = navController)
            }
        }
    }
}

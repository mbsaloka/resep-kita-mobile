package com.example.resepkita.repository

import com.example.resepkita.R
import com.example.resepkita.model.Recipe

object RecipeRepository {
    val recipes = listOf(
        Recipe(
            id = 1,
            title = "Nasi Goreng",
            imageRes = R.drawable.nasigoreng,
            ingredients = listOf("Nasi", "Telur", "Kecap", "Bumbu"),
            steps = listOf("Panaskan minyak", "Masukkan nasi", "Aduk rata dengan bumbu")
        ),
        // resep lain
    )
}

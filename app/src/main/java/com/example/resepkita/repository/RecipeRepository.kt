package com.example.resepkita.repository

import com.example.resepkita.R
import com.example.resepkita.model.Recipe

object RecipeRepository {
    fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                id = 1,
                title = "Nasi Goreng",
                imageRes = R.drawable.nasigoreng,
                ingredients = listOf("Nasi", "Telur", "Kecap", "Bumbu"),
                steps = listOf("Panaskan minyak", "Masukkan nasi", "Aduk rata dengan bumbu"),
                category = "Makanan Utama"
            ),
            Recipe(
                id = 2,
                title = "Mie Goreng",
                imageRes = R.drawable.miegoreng,
                ingredients = listOf("Mie", "Telur", "Kecap", "Bumbu"),
                steps = listOf("Rebus mie", "Tumis bumbu", "Masukkan mie dan aduk rata"),
                category = "Makanan Utama"
            ),
            Recipe(
                id = 3,
                title = "Es Teh Manis",
                imageRes = R.drawable.esteh,
                ingredients = listOf("Teh", "Gula", "Es Batu"),
                steps = listOf("Seduh teh", "Tambahkan gula dan es batu"),
                category = "Minuman"
            ),
            Recipe(
                id = 4,
                title = "Sate Ayam",
                imageRes = R.drawable.sateayam,
                ingredients = listOf("Daging ayam", "Bumbu kacang", "Tusuk sate"),
                steps = listOf(
                    "Potong daging ayam",
                    "Tusuk daging pada tusuk sate",
                    "Bakar dan sajikan dengan bumbu kacang"
                ),
                category = "Makanan Utama"
            ),
            Recipe(
                id = 5,
                title = "Pancake",
                imageRes = R.drawable.pancake,
                ingredients = listOf("Tepung terigu", "Telur", "Susu", "Gula"),
                steps = listOf(
                    "Campur semua bahan",
                    "Masak di wajan hingga kecokelatan",
                    "Sajikan dengan sirup maple"
                ),
                category = "Makanan Penutup"
            ),
            Recipe(
                id = 6,
                title = "Es Krim Vanila",
                imageRes = R.drawable.eskrim,
                ingredients = listOf("Susu", "Gula", "Vanila", "Es Batu"),
                steps = listOf(
                    "Campur semua bahan",
                    "Bekukan dalam freezer",
                    "Nikmati setelah beku"
                ),
                category = "Makanan Penutup"
            )
        )
    }
}

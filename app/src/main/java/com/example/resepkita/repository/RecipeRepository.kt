package com.example.resepkita.repository

import com.example.resepkita.R
import com.example.resepkita.model.Recipe

object RecipeRepository {
    fun getRecipes(): List<Recipe> {
        return listOf(
            // Main Course
            Recipe(
                id = 1,
                title = "Nasi Goreng",
                imageRes = R.drawable.nasigoreng,
                ingredients = listOf("Nasi", "Telur", "Kecap", "Bumbu"),
                steps = listOf("Panaskan minyak", "Masukkan nasi", "Aduk rata dengan bumbu"),
                category = "Main Course",
                difficulty = "Easy",
                time = 20,
                calories = 450,
                author = "Chef Budi",
                rating = 4.5f,
                favorite = true,
                cooked = true
            ),
            Recipe(
                id = 2,
                title = "Sate Ayam",
                imageRes = R.drawable.sateayam,
                ingredients = listOf("Daging ayam", "Bumbu kacang", "Tusuk sate"),
                steps = listOf("Potong daging ayam", "Tusuk sate", "Bakar dan sajikan dengan bumbu kacang"),
                category = "Main Course",
                difficulty = "Medium",
                time = 45,
                calories = 600,
                author = "Chef Sari",
                rating = 4.7f,
                favorite = false,
                cooked = true
            ),

            // Appetizer
            Recipe(
                id = 3,
                title = "Bruschetta",
                imageRes = R.drawable.bruschetta,
                ingredients = listOf("Roti", "Tomat", "Basil", "Minyak Zaitun"),
                steps = listOf("Panggang roti", "Taburkan tomat dan basil", "Siram minyak zaitun"),
                category = "Appetizer",
                difficulty = "Easy",
                time = 15,
                calories = 200,
                author = "Chef Rina",
                rating = 4.2f,
                favorite = false,
                cooked = false
            ),
            Recipe(
                id = 4,
                title = "Salad Buah",
                imageRes = R.drawable.saladbuah,
                ingredients = listOf("Buah-buahan", "Yogurt", "Madu"),
                steps = listOf("Potong buah", "Campur dengan yogurt dan madu"),
                category = "Appetizer",
                difficulty = "Easy",
                time = 10,
                calories = 180,
                author = "Chef Andi",
                rating = 4.6f,
                favorite = true,
                cooked = false
            ),

            // Dessert
            Recipe(
                id = 5,
                title = "Pancake",
                imageRes = R.drawable.pancake,
                ingredients = listOf("Tepung terigu", "Telur", "Susu", "Gula"),
                steps = listOf("Campur semua bahan", "Masak di wajan hingga kecokelatan", "Sajikan dengan sirup maple"),
                category = "Dessert",
                difficulty = "Medium",
                time = 30,
                calories = 350,
                author = "Chef Tono",
                rating = 4.4f,
                favorite = true,
                cooked = true
            ),
            Recipe(
                id = 6,
                title = "Es Krim Vanila",
                imageRes = R.drawable.eskrim,
                ingredients = listOf("Susu", "Gula", "Vanila", "Es Batu"),
                steps = listOf("Campur semua bahan", "Bekukan dalam freezer", "Nikmati setelah beku"),
                category = "Dessert",
                difficulty = "Hard",
                time = 180,
                calories = 250,
                author = "Chef Lia",
                rating = 4.8f,
                favorite = false,
                cooked = false
            ),

            // Side Dish
            Recipe(
                id = 7,
                title = "Kentang Goreng",
                imageRes = R.drawable.kentanggoreng,
                ingredients = listOf("Kentang", "Garam", "Minyak Goreng"),
                steps = listOf("Potong kentang", "Goreng dalam minyak panas", "Taburi garam"),
                category = "Side Dish",
                difficulty = "Easy",
                time = 25,
                calories = 300,
                author = "Chef Nia",
                rating = 4.3f,
                favorite = false,
                cooked = true
            ),
            Recipe(
                id = 8,
                title = "Onion Rings",
                imageRes = R.drawable.onionrings,
                ingredients = listOf("Bawang bombay", "Tepung", "Minyak Goreng"),
                steps = listOf("Iris bawang", "Baluri tepung", "Goreng hingga keemasan"),
                category = "Side Dish",
                difficulty = "Medium",
                time = 30,
                calories = 280,
                author = "Chef Kevin",
                rating = 4.1f,
                favorite = true,
                cooked = false
            ),

            // Soup
            Recipe(
                id = 9,
                title = "Sup Ayam",
                imageRes = R.drawable.supayam,
                ingredients = listOf("Ayam", "Wortel", "Kentang", "Bumbu sup"),
                steps = listOf("Rebus ayam", "Masukkan sayuran", "Masak hingga matang"),
                category = "Soup",
                difficulty = "Medium",
                time = 60,
                calories = 400,
                author = "Chef Dini",
                rating = 4.5f,
                favorite = false,
                cooked = true
            ),
            Recipe(
                id = 10,
                title = "Sup Tomat",
                imageRes = R.drawable.suptomat,
                ingredients = listOf("Tomat", "Bawang", "Kaldu"),
                steps = listOf("Tumis bawang", "Masukkan tomat", "Masak dengan kaldu"),
                category = "Soup",
                difficulty = "Easy",
                time = 40,
                calories = 250,
                author = "Chef Farah",
                rating = 4.0f,
                favorite = false,
                cooked = false
            ),

            // Drink
            Recipe(
                id = 11,
                title = "Es Teh Manis",
                imageRes = R.drawable.esteh,
                ingredients = listOf("Teh", "Gula", "Es Batu"),
                steps = listOf("Seduh teh", "Tambahkan gula dan es batu"),
                category = "Drink",
                difficulty = "Easy",
                time = 10,
                calories = 100,
                author = "Chef Wati",
                rating = 4.7f,
                favorite = true,
                cooked = true
            ),
            Recipe(
                id = 12,
                title = "Jus Alpukat",
                imageRes = R.drawable.jusalpukat,
                ingredients = listOf("Alpukat", "Susu kental manis", "Es Batu"),
                steps = listOf("Blender alpukat dengan susu", "Tambahkan es batu"),
                category = "Drink",
                difficulty = "Easy",
                time = 10,
                calories = 220,
                author = "Chef Doni",
                rating = 4.6f,
                favorite = false,
                cooked = false
            ),
            Recipe(
                id = 13,
                title = "Kwetiau Goreng",
                imageRes = R.drawable.kwetiau,
                ingredients = listOf("Kwetiau", "Daging sapi", "Sayuran", "Kecap", "Bawang putih"),
                steps = listOf(
                    "Tumis bawang putih hingga harum",
                    "Masukkan daging dan sayuran",
                    "Tambahkan kwetiau dan kecap, aduk rata",
                    "Masak hingga matang dan sajikan"
                ),
                category = "Main Course",
                difficulty = "Medium",
                time = 35,
                calories = 520,
                author = "Chef Lina",
                rating = 4.6f,
                favorite = false,
                cooked = false
            )
        ).shuffled()
    }
}

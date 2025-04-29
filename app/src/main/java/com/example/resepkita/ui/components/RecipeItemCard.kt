package com.example.resepkita.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resepkita.R
import com.example.resepkita.model.Recipe
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign

@Composable
fun RecipeItemCard(recipe: Recipe, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .padding(2.dp)
            .clickable(onClick = onClick)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = recipe.imageRes),
                contentDescription = recipe.title,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Canvas(modifier = Modifier.matchParentSize()) {
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black),
                        startY = size.height / 3,
                        endY = size.height
                    )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .align(androidx.compose.ui.Alignment.BottomStart)
            ) {
                Text(
                    text = recipe.title,
                    style = MaterialTheme.typography.headlineSmall.copy(fontSize = 18.sp),
                    color = MaterialTheme.colorScheme.onSecondary
                )
                Text(
                    text = recipe.ingredients.joinToString(", "),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 10.sp,
                        lineHeight = 12.sp),
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Preview
@Composable
fun RecipeItemCardPreview() {
    RecipeItemCard(
        recipe = Recipe(
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
        onClick = {}
    )
}

package com.example.resepkita.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resepkita.R
import com.example.resepkita.model.Recipe

@Composable
fun RecipeItemCard(recipe: Recipe, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = recipe.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(16.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = recipe.title,
                    style = MaterialTheme.typography.headlineSmall.copy(fontSize = 18.sp)
                )
                Text(
                    text = recipe.ingredients.joinToString(", "),
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 14.sp),
                    color = Color.Gray
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
            steps = listOf("Panaskan minyak", "Masukkan nasi", "Aduk rata dengan bumbu")
        ),
        onClick = {}
    )
}

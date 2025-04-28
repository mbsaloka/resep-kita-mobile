package com.example.resepkita.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resepkita.R

@Composable
fun CategoryChip(
    category: String,
    onClick: () -> Unit,
    isSelected: Boolean = false,
) {
    val backgroundColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface
    val textColor = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onBackground

    val iconResourceId = when (category.lowercase()) {
        "main course" -> R.drawable.maincourse
        "side dish" -> R.drawable.sidedish
        "dessert" -> R.drawable.dessert
        "appetizer" -> R.drawable.appetizer
        "soup" -> R.drawable.soup
        "drink" -> R.drawable.drink
        else -> R.drawable.category_icon
    }

    Card(
        modifier = Modifier
            .clickable { onClick() }
            .padding(1.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
//        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    ) {
        Column(
            modifier = Modifier
                .width(75.dp)
                .height(70.dp)
                .padding(2.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = iconResourceId),
                contentDescription = "icon_category",
                modifier = Modifier
                    .size(38.dp)
                    .padding(top = 2.dp)
            )

            // Text with fixed size
            Text(
                text = category,
                color = textColor,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontSize = 10.sp
                ),
                modifier = Modifier
//                    .scale(0.5f)
                    .fillMaxWidth()
                    .padding(top = 4.dp) // Padding between text and image
            )
        }
    }
}

@Preview
@Composable
fun CategoryChipPreview() {
    Column(modifier = Modifier.background(Color.White)) {
        CategoryChip(category = "Main Course", onClick = {})
        CategoryChip(category = "Drink", onClick = {}, isSelected = true)
    }
}

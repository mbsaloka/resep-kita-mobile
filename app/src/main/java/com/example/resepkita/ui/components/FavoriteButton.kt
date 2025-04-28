package com.example.resepkita.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FavoriteButton(
    isFavorite: Boolean,
    onFavoriteClick: () -> Unit
) {
    IconButton(onClick = onFavoriteClick) {
        Icon(
            imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = if (isFavorite) "Favorite" else "Not Favorite"
        )
    }
}

@Preview
@Composable
fun FavoriteButtonPreview() {
    val isFavorite = remember { false }
    FavoriteButton(isFavorite = isFavorite, onFavoriteClick = { /* handle favorite toggle */ })
}

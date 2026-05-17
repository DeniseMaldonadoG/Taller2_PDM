package com.pdm.foodspot.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val FoodSpotColorScheme = lightColorScheme(
    primary = Color(0xFFFF4D6D),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFFFD6E0),
    secondary = Color(0xFFFF9F1C),
    surface = Color(0xFFFFFFFF),
    background = Color(0xFFFFF0F3)
)

@Composable
fun FoodSpotTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = FoodSpotColorScheme,
        content = content
    )
}
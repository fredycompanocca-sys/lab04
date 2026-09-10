package com.example.lab04

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploCard() {
    Card(
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFD2E8D4)),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Text("Contenido de la tarjeta", Modifier.padding(16.dp))
    }
}
package com.example.lab04

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EjemploCard() {
    Card(modifier = Modifier.padding(8.dp)) {
        Text("Contenido de la tarjeta", Modifier.padding(16.dp))
    }
}
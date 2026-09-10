package com.example.lab04

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun EjemploSwitch() {
    // Comentario de Fredy - versión A
    var activo by remember { mutableStateOf(false) }
    Switch(
        checked = activo,
        onCheckedChange = { activo = it },
        colors = SwitchDefaults.colors(checkedThumbColor = Color(0xFF006400))
    )
}
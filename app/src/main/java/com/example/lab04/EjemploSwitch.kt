package com.example.lab04

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun EjemploSwitch() {
    var activo by remember { mutableStateOf(false) }
    Switch(checked = activo, onCheckedChange = { activo = it })
}
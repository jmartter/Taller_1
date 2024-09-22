package com.example.taller_1.estructura

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taller_1.ui.theme.Taller_1Theme

class PantallaConfiguracion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Taller_1Theme {
                PantallaConfiguracionScreen()
            }
        }
    }
}

@Composable
fun PantallaConfiguracionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Pantalla de Configuración",
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaConfiguracionScreenPreview() {
    Taller_1Theme {
        PantallaConfiguracionScreen()
    }
}
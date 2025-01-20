package com.example.petpal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petpal.ui.theme.PetPalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge content rendering
        enableEdgeToEdge()

        setContent {
            PetPalTheme {
                // Use Scaffold for material design layout structure
                Scaffold { paddingValues ->
                    LoginScreen(modifier = Modifier.padding(paddingValues))
                }
            }
        }
    }
}
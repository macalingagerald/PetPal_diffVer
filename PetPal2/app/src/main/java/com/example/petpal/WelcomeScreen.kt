package com.example.petpal

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Welcome()
        }
    }
}

@Composable
@Preview
fun Welcome() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White // Set the background color to solid white
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo and branding
            Image(
                painter = painterResource(id = R.drawable.cat),
                contentDescription = "PetPal Logo",
                modifier = Modifier
                    .size(150.dp) // Increased size of the logo
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "PetPal",
                fontSize = 36.sp, // Increased font size for the title
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF9966)
            )

            Text(
                text = "Adopt. Care. Love.",
                fontSize = 20.sp, // Increased font size for the subtitle
                color = Color(0xFF666666).copy(alpha = 0.7f)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Login button
            OutlinedButton(
                onClick = { /* TODO: Handle login */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp), // Increased button height
                shape = RoundedCornerShape(16.dp), // Slightly rounder button corners
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF666666)
                )
            ) {
                Text(
                    text = "Log In",
                    fontSize = 18.sp // Increased button text size
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Sign up button
            Button(
                onClick = { /* TODO: Handle sign up */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp), // Increased button height
                shape = RoundedCornerShape(16.dp), // Slightly rounder button corners
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF9966),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 18.sp // Increased button text size
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Skip text
            TextButton(
                onClick = { /* TODO: Handle skip */ },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = Color(0xFF666666)
                )
            ) {
                Text(
                    text = "Skip",
                    fontSize = 16.sp // Increased font size for skip text
                )
            }
        }
    }
}
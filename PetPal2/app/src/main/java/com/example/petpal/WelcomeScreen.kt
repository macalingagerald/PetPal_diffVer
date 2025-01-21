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
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.petpal.ui.theme.alata
import com.example.petpal.ui.theme.kumarOne
import com.example.petpal.ui.theme.poppinsBold
import com.example.petpal.ui.theme.smth_orange

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
                .padding(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo and branding
            Image(
                painter = painterResource(id = R.drawable.cat),
                contentDescription = "PetPal Logo",
                modifier = Modifier
                    .size(180.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Image(
                painter = painterResource(id = R.drawable.title_logo),
                contentDescription = "Title Logo",
                modifier = Modifier
                    .height(80.dp)
                    .width(200.dp)
            )

            Text(
                text = "Adopt. Care. Love.",
                fontSize = 15.sp,
                fontFamily = poppinsBold,
                color = smth_orange
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Login button
            OutlinedButton(
                onClick = { /* TODO: Handle login */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp), // Increased button height
                shape = RoundedCornerShape(16.dp), // Slightly rounder button corners
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF666666)
                )
            ) {
                Text(
                    text = "Log In",
                    fontSize = 18.sp,
                    fontFamily = alata,
                    color = smth_orange
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
                    fontSize = 18.sp,
                    fontFamily = alata,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Skip text
            TextButton(
                onClick = { /* TODO: Handle skip */ },
                colors = ButtonDefaults.textButtonColors
                    (contentColor = Color(0xFF666666))
            ) {
                Text(
                    text = "Skip",
                    fontSize = 16.sp,
                    fontFamily = alata,
                    color = Color(0x80000000)
                )
            }
        }
    }
}
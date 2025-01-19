package com.example.petpal

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.ui.draw.clip

@Composable
@OptIn(ExperimentalMaterial3Api::class)

fun RegisterScreen() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rememberMe by remember { mutableStateOf(false) }

    val coral = Color(0xFFFF7F50)
    val peach = Color(0xFFFFE4C4)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Register",
            fontSize = 32.sp,
            color = coral
        )

        Text(
            text = "Create your new account",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Username TextField
        TextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text("Username") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
                colors = TextFieldDefaults.textFieldColors(
                containerColor = peach,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(20.dp)
        )

        // Email TextField
        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
                colors = TextFieldDefaults.textFieldColors(
                containerColor = peach,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(20.dp)
        )

        // Password TextField
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = peach,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(20.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /* Handle login */ },
            modifier = Modifier
                .width(240.dp)
                .height(48.dp)
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x40000000),
                    ambientColor = Color(0x40000000)
                )
                .border(
                    width = 1.dp,
                    color = Color(0x40000000),
                    shape = RoundedCornerShape(size = 20.dp)
                ),
            colors = ButtonDefaults.buttonColors(containerColor = coral), // Assuming you want a coral color
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Log In")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    colors = CheckboxDefaults.colors(checkedColor = coral)

                )

                Text("Remember me")
            }
            Spacer(modifier = Modifier.weight(1f))
            TextButton(onClick = { /* Handle forgot password */ }) {
                Text(
                    "Forgot Password?",
                    color = coral
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Divider(modifier = Modifier.weight(1f))
            Text(
                "Or continue with",
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.Gray
            )
            Divider(modifier = Modifier.weight(1f))
        }

        OutlinedButton(
            onClick = { /* Handle Google sign in */ },
            modifier = Modifier
                .size(35.dp),
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google), // Replace with actual Google icon resource
                contentDescription = "Google",
                modifier = Modifier.size(24.dp),
                tint = Color.Unspecified // Use this to keep the icon's original colors
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Already have an account?")
            TextButton(onClick = { /* Handle navigation to login */ }) {
                Text(
                    "Log in",
                    color = coral
                )
            }
        }
    }
}

@Preview(
    name = "Register",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RegisterScreenPreview() {
    // Wrap with your app's theme if you have one
    // YourAppTheme {
    RegisterScreen()
    // }
}
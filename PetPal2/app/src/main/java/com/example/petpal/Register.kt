package com.example.petpal

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.petpal.ui.theme.coral
import com.example.petpal.ui.theme.kumarOne
import com.example.petpal.ui.theme.light_orange
import com.example.petpal.ui.theme.peach
import com.example.petpal.ui.theme.smth_black
import com.example.petpal.ui.theme.smth_orange

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterScreen()
        }
    }
}

@Composable
@Preview
fun RegisterScreen() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rememberMe by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Register",
                style = TextStyle(
                    fontSize = 35.sp,
                    fontFamily = kumarOne,
                    color = smth_orange,
                    textAlign = TextAlign.Center,
                )
            )

            Spacer(modifier = Modifier.height(29.dp))
            Text(
                text = "Create your new account",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = kumarOne,
                    color = smth_orange,
                    textAlign = TextAlign.Center,
                )
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
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedContainerColor = light_orange,
                    unfocusedContainerColor = light_orange,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
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
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedContainerColor = light_orange,
                    unfocusedContainerColor = light_orange,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
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
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedContainerColor = light_orange,
                    unfocusedContainerColor = light_orange,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
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
                    .padding(horizontal = 60.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = {},
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = smth_orange,
                        contentColor = light_orange
                    ),
                    modifier = Modifier
                        .size(13.dp)
                        .offset(y = (29).dp)
                        .offset(x = (-45).dp)) {
                }

                Text(
                    text = "Remember Me",
                    //fontFamily = alata,
                    fontSize = 10.sp,
                    color = smth_black,
                    modifier = Modifier
                        .offset(y = (30).dp)
                        .offset(x = (-40).dp)
                )

                Spacer(modifier = Modifier.weight(0.5f))


                Text(
                    text = "Forgot Password",
                    //fontFamily = alata,
                    fontSize = 10.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .offset(y = (30).dp)
                        .offset(x = (45).dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(modifier = Modifier.weight(1f))

                Text(
                    "Or continue with",
                    modifier = Modifier.padding(horizontal = 16.dp))

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
}
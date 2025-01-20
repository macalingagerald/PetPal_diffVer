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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.petpal.ui.theme.light_orange
import com.example.petpal.ui.theme.smth_black
import com.example.petpal.ui.theme.smth_orange

@Composable
@OptIn(ExperimentalMaterial3Api::class)

fun RegisterScreen() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rememberMe by remember { mutableStateOf(false) }

    val coral = Color(0xFFFF7F50)
    val peach = Color(0xFFFFE4C4)

    Spacer(modifier = Modifier.height(32.dp))

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
                fontFamily = FontFamily(Font(R.font.kumar_one)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFF8D4C),
                textAlign = TextAlign.Center,
            )
        )

        Spacer(modifier = Modifier.height(29.dp))
        Text(
            text = "Create your new account",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.kumar_one)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFF8D4C),
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

            Divider(modifier = Modifier.weight(0.5f))


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

@Preview(
    name = "Register",
    showBackground = true,
    showSystemUi = false // Change this to false if unnecessary
)

@Composable
fun RegisterScreenPreview() {
    // Wrap with your app's theme if you have one
    // YourAppTheme {
    RegisterScreen()
    // }
}
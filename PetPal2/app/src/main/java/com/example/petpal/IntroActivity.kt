package com.example.petpal

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.petpal.ui.theme.alata
import com.example.petpal.ui.theme.poppinsBold
import com.example.petpal.ui.theme.smth_black
import com.example.petpal.ui.theme.smth_orange

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            WelcomeScreen()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(20.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.cat),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.title),
            contentDescription = null,
            modifier = Modifier
                .height(80.dp)
                .width(200.dp)
        )

        Text(
            text = "Adopt. Care. Love.",
            //fontFamily = poppinsBold,
            fontSize = 15.sp,
            color = smth_orange)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.White)
            ) {
                Text(
                    text = "Log In",
                    fontSize = 18.sp,
                    //fontFamily = alata,
                    color = smth_orange)
            }

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = smth_orange,
                    containerColor = smth_orange)
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 18.sp,
                    //fontFamily = alata,
                    color = Color.Black)
            }
        }
        TextButton(
            onClick = { /* TODO: Handle skip */ },
            colors = ButtonDefaults.textButtonColors
                (contentColor = smth_black)
        ) {
            Text(
                text = "Skip",
                fontSize = 16.sp,
                //fontFamily = alata,
                color = smth_black,
                modifier = Modifier.align(Alignment.Bottom)
            )
        }
    }
}
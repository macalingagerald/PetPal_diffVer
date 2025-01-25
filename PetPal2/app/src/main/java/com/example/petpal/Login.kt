package com.example.petpal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.petpal.ui.theme.PetPalTheme
import com.example.petpal.ui.theme.alata
import com.example.petpal.ui.theme.kumarOne
import com.example.petpal.ui.theme.light_orange
import com.example.petpal.ui.theme.poppinsBold
import com.example.petpal.ui.theme.smth_black
import com.example.petpal.ui.theme.smth_orange

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreen() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .safeDrawingPadding()
    ) {
        val (
            topdesign,
            textdesign,
            botdesign,
        ) = createRefs()

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(topdesign) {
                    top.linkTo(parent.top)
                }
        ) {
            val botdesign = this

            Image(
                painter = painterResource(id = R.drawable.topdesign1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                Alignment.TopCenter
            )

            Image(
                painter = painterResource(id = R.drawable.topcat),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .offset(y = (4).dp)
                    .align(Alignment.TopEnd),
                Alignment.TopEnd
            )

            Image(
                painter = painterResource(id = R.drawable.topdesign2),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(360.dp),
                Alignment.TopCenter
            )
            //Back Button
            Image(
                painter = painterResource(id = R.drawable.back_button),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .offset(y = (30).dp)
                    .offset(x = (30).dp)
                    .align(Alignment.TopStart)
                    .clickable { }
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .constrainAs(textdesign) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Welcome Back",
                //fontFamily = kumarOne,
                fontSize = 30.sp,
                color = smth_orange,
                modifier = Modifier
                    .offset(y = (-60).dp)
            )

            Text(
                text = "Log in to your Account",
                //fontFamily = poppinsBold,
                fontSize = 15.sp,
                color = Color.Black,
                modifier = Modifier
                    .offset(y = (-50).dp)
            )
            //Username Input
            TextField(
                modifier = Modifier
                    .height(25.dp),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedContainerColor = light_orange,
                    unfocusedContainerColor = light_orange,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(15.dp),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 12.sp
                ),
                maxLines = 1,
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Username",
                        //fontFamily = alata,
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .offset(x = (30).dp)
                            .offset(y = (-3).dp)
                    )
                })

            Spacer(modifier = Modifier.height(40.dp))
            //Password Input
            TextField(
                modifier = Modifier
                    .height(25.dp),
                shape = RoundedCornerShape(15.dp),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedContainerColor = light_orange,
                    unfocusedContainerColor = light_orange,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 12.sp
                ),
                maxLines = 1,
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Password",
                        //fontFamily = alata,
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .offset(x = (30).dp)
                            .offset(y = (-3).dp)
                    )
                }
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
                    .padding(vertical = 30.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                //Remember Me Button
                Button(
                    onClick = {},
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = smth_orange,
                        contentColor = light_orange
                    ),
                    modifier = Modifier
                        .size(13.dp)
                ) {

                }

                Text(
                    text = "Remember Me",
                    //fontFamily = alata,
                    fontSize = 10.sp,
                    color = smth_black,
                    modifier = Modifier
                        .offset(x = (3).dp)
                )

                Spacer(modifier = Modifier.width(100.dp))
                //Forgot Password
                Text(
                    text = "Forgot Password",
                    fontFamily = alata,
                    fontSize = 10.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .clickable {  }
                )
            }
        }

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(botdesign) {
                    bottom.linkTo(parent.bottom)
                }
        ) {
            val botdesign = this

            Image(
                painter = painterResource(id = R.drawable.botdesign1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(360.dp)
                    .align(Alignment.BottomCenter),
                Alignment.BottomCenter
            )

            Image(
                painter = painterResource(id = R.drawable.botcat),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .align(Alignment.BottomStart)
                    .padding(start = 30.dp)
                    .padding(bottom = 30.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.botdesign2),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(360.dp)
                    .align(Alignment.BottomCenter),
                Alignment.BottomCenter
            )
        }
    }
}
package com.example.bmicalculatorapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ResultScreen(result: String, navCon: NavHostController) {
    Box(
        modifier = Modifier
            .requiredWidth(width = 428.dp)
            .requiredHeight(height = 926.dp)
            .background(color = Color.Black.copy(alpha = 0.67f))
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "WhatsApp Image 2024-04-22 at 2.46 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 98.dp)
                .requiredWidth(width = 428.dp)
                .requiredHeight(height = 828.dp))

        OutlinedButton(
            onClick = {navCon.navigate("BMI")},
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            border = BorderStroke(5.dp, Color.White),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(
                    x = 1.dp,
                    y = 700.dp
                )
                .requiredWidth(width = 260.dp)
                .requiredHeight(height = 60.dp)
        ){
            Text(
                text = "Go Back",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 26.sp
                )
            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-3).dp,
                    y = (-80).dp)
                .requiredWidth(width = 431.dp)
                .requiredHeight(height = 551.dp)
                .clip(shape = RoundedCornerShape(bottomStart = 70.dp, bottomEnd = 70.dp))
                .background(color = Color(0xff656858)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 151.dp)
                .requiredWidth(width = 203.dp)
                .requiredHeight(height = 120.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(border = BorderStroke(2.dp, Color(0xff656858)),
                    shape = RoundedCornerShape(30.dp)))
        Text(
//            text = "Normal Weight",
            text = "$result",
            color = Color(0xff656858),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 126.dp,
                    y = 186.dp)
                .requiredWidth(width = 172.dp)
                .requiredHeight(height = 93.dp))
    }
}


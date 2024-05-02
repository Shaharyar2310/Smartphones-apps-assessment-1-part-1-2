package com.example.bmicalculatorapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Calculator(navCon: NavHostController) {
    var countWeight by rememberSaveable() { mutableStateOf(54) }
    var countHeight by rememberSaveable() { mutableStateOf(142) }
    var bimResult by rememberSaveable() { mutableStateOf("") }

    //  BMI
    fun calculateBMI(weight: Int, height: Int): Double {
        val heightInMeters = height / 100.0
        return weight / (heightInMeters * heightInMeters)
    }

    // Function to classify BMI
    fun classifyBMI(bmi: Double): String {
        return when {
            bmi < 18.5 -> "Underweight"
            bmi < 24.9 -> "Normal Weight"
            bmi < 29.9 -> "Overweight"
            bmi < 34.9 -> "Obesity Class I"
            bmi < 39.9 -> "Obesity Class II"
            else -> "Obesity Class III"
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black.copy(alpha = 0.67f))
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "background",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 98.dp
                )
                .width(428.dp)
                .height(828.dp))

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-3).dp,
                    y = 1.dp
                )
                .requiredWidth(width = 431.dp)
                .requiredHeight(height = 194.dp)
                .clip(shape = RoundedCornerShape(bottomEnd = 40.dp))
                .background(color = Color(0xff656858))) {
            Text(
                text = "To calculate your BMI",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 26.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 29.dp,
                        y = 40.dp
                    )
                    .requiredWidth(width = 302.dp)
                    .requiredHeight(height = 42.dp)
            )
            Text(
                text = "choose your height and weight",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 53.dp,
                        y = 85.dp
                    )
                    .requiredWidth(width = 240.dp)
                    .requiredHeight(height = 42.dp)
            )

        }





        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 228.dp,
                    y = 324.dp
                )
                .requiredWidth(width = 170.dp)
                .requiredHeight(height = 189.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(
                    border = BorderStroke(2.dp, Color(0xff656858)),
                    shape = RoundedCornerShape(30.dp)
                ))
        Text(
            text = "height (cm)",
            color = Color(0xffacacac),
            textAlign = TextAlign.Center,
            lineHeight = 6.25.em,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 283.dp,
                    y = 349.dp
                ))
        Text(
            text = "$countHeight",
            color = Color(0xff868a74),
            textAlign = TextAlign.Center,
            lineHeight = 2.08.em,
            style = TextStyle(
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 272.dp,
                    y = 380.dp
                ))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 252.dp,
                    y = 451.dp
                )
                .requiredSize(size = 40.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White)
                .border(
                    border = BorderStroke(
                        2.dp,
                        Color(0xff656858)
                    ),
                    shape = CircleShape
                )
        ) {
            IconButton(
                onClick = { countHeight++ },
                content = {
                    Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add",
                    tint = Color(0xff868a74)
                )},

                        )


        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 331.dp,
                    y = 451.dp
                )
                .requiredSize(size = 40.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White)
                .border(
                    border = BorderStroke(2.dp, Color(0xff656858)),
                    shape = CircleShape
                )){
            IconButton(
                onClick = {countHeight-- },
                content = {Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "remove",
                    tint = Color(0xff868a74)
                )},
                )}










        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 324.dp
                )
                .requiredWidth(width = 170.dp)
                .requiredHeight(height = 189.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
                .border(
                    border = BorderStroke(2.dp, Color(0xff656858)),
                    shape = RoundedCornerShape(30.dp)
                ))
            Text(
                text = "weight (kg)",
                color = Color(0xffacacac),
                textAlign = TextAlign.Center,
                lineHeight = 6.25.em,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 77.dp,
                        y = 349.dp
                    )
            )
            Text(
                text = "$countWeight",
                color = Color(0xff868a74),
                textAlign = TextAlign.Center,
                lineHeight = 2.08.em,
                style = TextStyle(
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 80.dp,
                        y = 380.dp
                    )
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 53.dp,
                        y = 451.dp
                    )
                    .requiredSize(size = 40.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(2.dp, Color(0xff656858)),
                        shape = CircleShape
                    )
            ){IconButton(
                onClick = { countWeight++},
                content = {Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "ADD",
                    tint = Color(0xff868a74))
                          },

            )
            }

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 132.dp,
                        y = 451.dp
                    )
                    .requiredSize(size = 40.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(2.dp, Color(0xff656858)),
                        shape = CircleShape
                    )
            ){IconButton(
                onClick = { countWeight--},
                content = {Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "remove",
                    tint = Color(0xff868a74)
                )},
            )}










        OutlinedButton(
            onClick = {
                val bmi = calculateBMI(countWeight, countHeight)
                val classification = classifyBMI(bmi)
                bimResult = classification
                navCon.navigate("${ResultScreen.route}/$bimResult")
            },
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
        ) {
            Text(
                text = "Calculate",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 26.sp
                )
            )
        }
    }
}

//@Composable
//fun ResultScreen(result: String) {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "Your BMI Classification is: $result",
//            color = Color.White,
//            textAlign = TextAlign.Center,
//            style = TextStyle(
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold
//            )
//        )
//    }
//}



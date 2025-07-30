package com.example.woof.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.woof.R


val AbrilFactFace  = FontFamily(
    Font(R.font.abril_fatface_regular)
)

val Playwite =FontFamily(
    Font(R.font.playwrite_thin),
    Font(R.font.playwrite_light),
    Font(R.font.playwrite_regular),
    Font(R.font.playwrite_extra_light)
)
// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Playwite,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = AbrilFactFace,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = AbrilFactFace,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp
    ),
    labelMedium = TextStyle(
        fontFamily = AbrilFactFace,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    labelSmall = TextStyle(
        fontFamily = AbrilFactFace,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
    ),
    displayLarge = TextStyle(
        fontFamily = Playwite,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Playwite,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = Playwite,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily =Playwite,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily =Playwite,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
    ),
    bodySmall = TextStyle(
        fontFamily =Playwite,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),

)
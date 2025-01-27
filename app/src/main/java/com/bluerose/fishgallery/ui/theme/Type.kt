package com.bluerose.fishgallery.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bluerose.fishgallery.R

val fonts = FontFamily(
    Font(resId = R.font.roboto_regular, weight = FontWeight.Normal),
    Font(resId = R.font.roboto_medium, weight = FontWeight.Medium),
    Font(resId = R.font.roboto_bold, weight = FontWeight.Bold),
    Font(resId = R.font.roboto_light, weight = FontWeight.Light)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val TypographyStatisticsCard = Typography(
    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 23.44.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        lineHeight = 37.5.sp,
        letterSpacing = 0.sp,
        color = OnSecondaryColor_BlueRose
    ),
    titleSmall = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 28.13.sp,
        letterSpacing = 0.sp,
        color = OnSurfaceColor_BlueRose
    ),
)

val TypographyStatisticsViewDisplay = Typography(
    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 23.44.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 24.sp,
        lineHeight = 28.13.sp,
        letterSpacing = 0.sp,
        color = OnPrimaryColor_BlueRose
    ),
    titleMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 32.sp,
        lineHeight = 37.5.sp,
        letterSpacing = 0.sp,
        color = OnPrimaryColor_BlueRose
    ),
    titleSmall = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 28.13.sp,
        letterSpacing = 0.sp,
        color = OnPrimaryColor_BlueRose
    ),
)

val TypographyCatchCard = Typography(
    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        lineHeight = 17.75.sp,
        letterSpacing = 0.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 17.75.sp,
        letterSpacing = 0.sp,
    )
)
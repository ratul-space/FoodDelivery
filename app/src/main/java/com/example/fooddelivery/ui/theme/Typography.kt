package com.example.fooddelivery.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

private val UnboundedFontFamily = FontFamily(
    Font(R.font.font_unbounded_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.font_unbounded_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.font_unbounded_light, FontWeight.Light, FontStyle.Normal)
)
@Immutable
data class AppTypography(
    val headline: TextStyle,
    val tytleLarge: TextStyle,
    val tytleMedium: TextStyle,
    val tytleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle
)
val localAppTypography = staticCompositionLocalOf {
    AppTypography(
        headline = TextStyle.Default,
        tytleLarge = TextStyle.Default,
        tytleMedium = TextStyle.Default,
        tytleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        label = TextStyle.Default
    )
}
val extentedTypography = AppTypography(
    headline = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Normal
    ),
    tytleLarge = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal
),
    tytleMedium = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal
    ),
    tytleSmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),
    body = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    bodySmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    ),
    label = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Light
    )
)
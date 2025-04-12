package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Pink = Color(0xFFF28482)
val Green = Color(0xFF84A59D)
val Yollow = Color(0xFFF7EDE2)
val YollowLingt = Color(0xFFFFFFF2)
val Dark = Color(0x883D405D)

@Immutable
data class AppColours (
    val background: Color,
    val onBanckground: Color,
    val surface: Color,
    val onSarface: Color,
    val seconderySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRagularSarface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color
)

val localAppColours = staticCompositionLocalOf {
    AppColours (
        background = Color.Unspecified,
        onBanckground = Color.Unspecified,
        surface = Color.Unspecified,
        onSarface = Color.Unspecified,
        seconderySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRagularSarface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified,
    )
}
val extendedColours = AppColours(
    background = Color.White,
    onBanckground = Color.DarkGray,
    surface = Color.White,
    onSarface = Color.DarkGray,
    seconderySurface = Color.Blue,
    onSecondarySurface = Color.White,
    regularSurface = Color.Yellow

)
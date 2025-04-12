package com.example.fooddelivery.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
CompositionLocalProvider (
    localAppColours provides extendedColours,
    localAppTypography provides extentedTypography
) {
    MaterialTheme(
        content = content
    )
 }
}
object AppTheme{
    val colours: AppColours
    @Composable
    get() = localAppColours.current
    val typography: AppTypography
    @Composable
    get() = localAppTypography.current
}
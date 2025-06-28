package com.yournus.shopping.core.designsystem.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = YournusColor.White,
    onPrimary = YournusColor.Blue01,
    primaryContainer = YournusColor.Graphite,
    onPrimaryContainer = YournusColor.White,
    inversePrimary = YournusColor.Blue02,
    secondary = YournusColor.Blue04,
    onSecondary = YournusColor.Blue01,
    secondaryContainer = YournusColor.Blue04,
    onSecondaryContainer = YournusColor.LightWhite,
    surfaceContainerLow = YournusColor.LightWhite,
    tertiary = YournusColor.Yellow05,
    onTertiary = YournusColor.Yellow01,
    tertiaryContainer = YournusColor.Yellow04,
    onTertiaryContainer = YournusColor.White,
    error = YournusColor.Red02,
    onError = YournusColor.Red05,
    errorContainer = YournusColor.Red04,
    onErrorContainer = YournusColor.Red01,
    surface = YournusColor.Graphite,
    onSurface = YournusColor.White,
    onSurfaceVariant = YournusColor.White,
    surfaceVariant = YournusColor.White,
    surfaceDim = YournusColor.Black,
    surfaceContainerHigh = YournusColor.DuskGray,
    inverseSurface = YournusColor.Neon05,
    inverseOnSurface = YournusColor.Black,
    outline = YournusColor.DarkGray,
    outlineVariant = YournusColor.Cosmos,
    scrim = YournusColor.Black,
    surfaceContainerLowest = YournusColor.Graphite,
)

private val LightColorScheme = lightColorScheme(
    primary = YournusColor.Neon01,
    onPrimary = YournusColor.White,
    primaryContainer = YournusColor.White,
    onPrimaryContainer = YournusColor.Graphite,
    inversePrimary = YournusColor.Neon01,
    secondary = YournusColor.Blue04,
    onSecondary = YournusColor.White,
    secondaryContainer = YournusColor.Blue01,
    onSecondaryContainer = YournusColor.LightBlack,
    surfaceContainerLow = YournusColor.Blue01,
    tertiary = YournusColor.Yellow01,
    onTertiary = YournusColor.Black,
    tertiaryContainer = YournusColor.Yellow03A40,
    onTertiaryContainer = YournusColor.Yellow04,
    error = YournusColor.Red03,
    onError = YournusColor.White,
    errorContainer = YournusColor.Red01,
    onErrorContainer = YournusColor.Red06,
    surface = YournusColor.White,
    onSurface = YournusColor.Black,
    onSurfaceVariant = YournusColor.DarkGray,
    surfaceVariant = YournusColor.Graphite,
    surfaceDim = YournusColor.PaleGray,
    surfaceContainerHigh = YournusColor.LightGray,
    inverseSurface = YournusColor.Yellow05,
    inverseOnSurface = YournusColor.White,
    outline = YournusColor.Gainsboro,
    outlineVariant = YournusColor.DarkGray,
    scrim = YournusColor.Black,
    surfaceContainerLowest = YournusColor.PaleGray,
)

val LocalDarkTheme = compositionLocalOf { true }

@Composable
fun KnightsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    if (!LocalInspectionMode.current) {
        val view = LocalView.current
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars =
                !darkTheme
        }
    }

    CompositionLocalProvider(
        LocalDarkTheme provides darkTheme,
        LocalTypography provides Typography
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content,
        )
    }
}

object YournusTheme {
    val typography: YournusTypography
        @Composable
        get() = LocalTypography.current
}
package com.example.reportsummaryappclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = ClickedButtonColor,
    secondary = ButtonColor,
    surface = BottomAppBarColor,
    background = BackgroundColor,

    onPrimary = Black,
    onSecondary = UserActiveButton,
    onSurface = SubTextColor,
    onBackground = White,

    surfaceVariant = GradientColor1,
    onSurfaceVariant = GradientColor2
)

private val LightColorScheme = lightColorScheme(
    primary = ClickedButtonColor,
    secondary = ButtonColor,
    surface = BottomAppBarColor,
    background = BackgroundColor,

    onPrimary = Black,
    onSecondary = UserActiveButton,
    onSurface = SubTextColor,
    onBackground = White,

    surfaceVariant = GradientColor1,
    onSurfaceVariant = GradientColor2

)

@Composable
fun ReportSummaryAppCloneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
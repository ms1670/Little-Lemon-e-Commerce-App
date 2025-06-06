package com.example.littlelemon_compose

import android.icu.number.IntegerWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

//@Composable
//fun ResWinSize(){
//
//}

data class ResWinSize(
    val width: WindowType,
    val height: WindowType
)

enum class WindowType{
    Compact, Medium, Expanded
}

@Composable
fun rememberWindowSize(): ResWinSize {
        val configuration = LocalConfiguration.current

    return ResWinSize(
        width = when {
            configuration.screenWidthDp < 600 -> WindowType.Compact
            configuration.screenWidthDp < 840 -> WindowType.Medium
            else -> WindowType.Expanded
        },

        height = when {
            configuration.screenWidthDp < 600 -> WindowType.Compact
            configuration.screenWidthDp < 840 -> WindowType.Medium
            else -> WindowType.Expanded
        },

    )
}

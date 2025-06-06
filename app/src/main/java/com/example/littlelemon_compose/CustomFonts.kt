package com.example.littlelemon_compose

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun CustomFonts(){
    Column() {
        // Normal Text
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppYellow,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.width(300.dp)
        )

        // Normal Text with Font Family
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppYellow,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace
            ),
            modifier = Modifier.width(300.dp)
        )

        // Normal Text with Font Family and Letter Spacing
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppYellow,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                letterSpacing = 4.sp
            ),
            modifier = Modifier.width(300.dp)
        )

        // Normal Text with Letter Spacing and Shadow
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppYellow,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                shadow = Shadow(
                    color = Color.Blue,
                    offset = Offset(8f, 8f),
                    blurRadius = 4f
                ),
                letterSpacing = 4.sp
            ),
            modifier = Modifier.width(300.dp),

        )

        // Normal Text with Under Line
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppGreen,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                textDecoration = TextDecoration.Underline,
            ),
            modifier = Modifier.width(300.dp)
        )

        // Normal Text with Text Decoration
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppGreen,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                //textDecoration = TextDecoration.Underline
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.Underline,
                        TextDecoration.LineThrough,
                    )
                ),
            ),
            modifier = Modifier.width(300.dp)
        )

        // Normal Text with Bold and Italic
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = AppColors.AppGreen,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            ),
            modifier = Modifier.width(300.dp)
        )

        //Customizing Individual Letters
        Row (
            modifier = Modifier.width(300.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = AppColors.AppOrange,
                            fontSize = 24.sp
                        )
                    ){
                        append("Lit")
                    }
                    append("tle ")
                },
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Monospace,
                ),
            )

            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = AppColors.AppOrange,
                            fontSize = 24.sp
                        )
                    ){
                        append("Le")
                    }
                    append("mon")
                },
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Monospace,
                ),
            )
        }

    }
}

fun withStyle(style: Any) {
    TODO("Not yet implemented")
}

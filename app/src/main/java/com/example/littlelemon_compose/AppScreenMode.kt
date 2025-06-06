package com.example.littlelemon_compose

import android.content.res.Configuration
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemon_compose.ui.theme.DarkColorScheme
import com.example.littlelemon_compose.ui.theme.LightColorScheme

@Composable
fun AppScreenMode(){
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkColorScheme else LightColorScheme
    )
    {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(text = "Little Lemon")
            Text(text = "Chicago")
            Button(onClick = { "/*Todo*/"}) {
                Text(text = "BTN1")
            }
            Button(onClick = { "/*Todo*/"}) {
                Text(text = "BTN2")
            }
            OutlinedButton(onClick = { "/*Todo*/"}) {
                Text(text = "OBTN")
            }
            Slider(value = 5f, onValueChange = {})
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppScreenModeLightPreview(){
    AppScreenMode()
}

@Preview(name = "Dark Mode Preview", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AppScreenModeDarkPreview(){
    AppScreenMode()
}

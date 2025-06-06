package com.example.littlelemon_compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun AnimationSamp(){
    //AnimateAppLogo()
    Column () {
        AnimateAppBTN()
        HorizontalDivider()
        AnimateAppBTN1()
    }
}

@Composable
fun AnimateAppLogo(){

    var alfaImg by remember {
        mutableStateOf(0f)
    }

    val animateAlfaImage by animateFloatAsState(
        targetValue = alfaImg,
        animationSpec = tween(
            durationMillis = 4000
        )
    )

        Box(
        modifier = Modifier.fillMaxSize()
            .clickable {
                alfaImg += 1
            }
    ){
        Image(painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = "",
            modifier = Modifier.align(Alignment.Center)
        )

        Image(painter = painterResource(id = R.drawable.little_lemon),
            contentDescription = "",
            modifier = Modifier.align(Alignment.Center)
                .alpha(alpha = animateAlfaImage)
        )
    }
}

@Composable
fun AnimateAppBTN(){
    var visible by remember {
        mutableStateOf(true)
    }
    Column {
        AnimatedVisibility(visible = visible) {
            Text(text = "Hello, world!")
        }
        Button(onClick = { visible = !visible }) {
            Text("Button")
        }
    }
}

@Composable
fun AnimateAppBTN1(){
    var visible by remember {
        mutableStateOf(true)
    }
    Column {
        Button(onClick = { visible = !visible }) {
            Text("Button")
        }
        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(text = "Hello, world!")
        }
    }
}
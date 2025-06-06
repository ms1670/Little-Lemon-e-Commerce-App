package com.example.littlelemon_compose

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SurfaceModes(){
    Column {
        Surface(
            color = AppColors.AppGreen,
            modifier = Modifier
                .height(150.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Lemon",
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(30.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
                    //.border(2.dp, AppColors.AppCharcoal)
            )
        }

        Surface(
            color = AppColors.AppYellow,
            modifier = Modifier
                .height(250.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Lemon",
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(30.dp)
                    .wrapContentSize(align = Alignment.BottomEnd)
             )
        }
    }

}




@Preview(showBackground = true)
@Composable
fun SurfaceBg(){
    Surface(
        color = AppColors.AppYellow,
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(92.dp, 0.dp, 92.dp, 0.dp),
        border = BorderStroke(12.dp, AppColors.AppOrange)
    ){

    }
}

@SuppressLint("ModifierFactoryExtensionFunction")
private fun Any.wrapContentHeight(align: Alignment): Modifier {
    TODO("Not yet implemented")
}

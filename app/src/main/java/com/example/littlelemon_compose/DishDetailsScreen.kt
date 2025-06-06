package com.example.littlelemon_compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController




@Preview
@Composable
fun DishDetailsScreen(){

    Column (
        modifier = Modifier
            .background(Color(0xFFE6DFEB))
            .fillMaxHeight()
            .padding(16.dp),

        ) {
        Image(
            painter = painterResource(id = R.drawable.greeksalad),
            //painter = painterResource(id = Dish.image),
            contentDescription = "",
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .fillMaxWidth()
            //contentScale = ContentScale.FillWidth

        )

        Column () {
            Text(
                text = "Greek Salad",
                //text = Dish.name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 28.sp
            )

            Text(
                text = "Greek Salad",
              //  text = Dish.description,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 24.sp
            )
        }
    }

}


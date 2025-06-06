package com.example.littlelemon_compose

import android.os.Build
import android.view.RoundedCorner
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ScrollableGalleryScreen(){
    Column(Modifier.verticalScroll(rememberScrollState())) {
        repeat(10){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                repeat(2){
                    GalleryCell()
                }
            }
        }
    }
//    Column {
//        GalleryCell()
//        GalleryCellOne()
//    }
}

@Composable
fun GalleryCell(){
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 16.dp
        ),
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(
            modifier = Modifier.requiredSize(180.dp, 180.dp)
                .padding(8.dp)
        ){

            Image(
                painter = painterResource( id = R.drawable.greeksalad),
                contentDescription = "Greek Salad",
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
            )

            Text(
                text = "Greek Salad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF050505),
                modifier = Modifier
                    .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                    .align(Alignment.TopCenter)
                    .background(Color(0x808F8F8F))
                    .fillMaxWidth()
                    .height(32.dp)
                    .padding(top = 4.dp, start = 4.dp)
                    .wrapContentHeight()

            )

            Text(
                text = "  $12.99  ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF050505),
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 16.dp, bottomEnd = 15.dp))
                    .padding(start = 4.dp)
                    .background(Color(0xD0FFFFFF))
                    .align(Alignment.BottomEnd)
                    .height(24.dp)
                    .wrapContentHeight()
            )
        }

    }
}



@Composable
fun GalleryCellOne(){
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 16.dp
        ),
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(
            modifier = Modifier.requiredSize(180.dp, 180.dp)
                .padding(8.dp)
        ){

            Image(
                painter = painterResource( id = R.drawable.greeksalad),
                contentDescription = "Greek Salad",
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
            )

            Text(
                text = "Greek Salad One",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF050505),
                modifier = Modifier
                    .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                    .align(Alignment.TopCenter)
                    .background(Color(0xFFE6DFEB))
                    .fillMaxWidth()
                    .height(32.dp)
                    .padding(top = 4.dp, start = 4.dp)
                    .wrapContentHeight()

            )


            Text(
                text = " $12.99  ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF050505),
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 16.dp, bottomEnd = 15.dp))
                    .padding(start = 4.dp)
                    .background(Color(0xE6DFEBFF))
                    .align(Alignment.BottomEnd)
                    .height(24.dp)
                    .wrapContentHeight()
            )
        }

    }
}

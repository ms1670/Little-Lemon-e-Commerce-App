package com.example.littlelemon_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MenuGrid(){
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        repeat(10){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
                repeat(2){
                    gridCell()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun gridCell(): GridCells {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 16.dp
        ),
        modifier = Modifier.padding(8.dp),
       ) {
        Box (
            modifier = Modifier
                .requiredSize(180.dp, 180.dp)
                .padding(8.dp),
        ){
            Image(
                painter = painterResource( id = R.drawable.greeksalad),
                contentDescription = "Greek Salad"
            )

            Row (
                modifier = Modifier.align(Alignment.TopCenter)
                    .background(Color(0x80ABABAB))
                    .fillMaxWidth()
                    .height(32.dp)
                    .padding(top = 4.dp)
                    .wrapContentHeight()
            ) {
                Text(
                    text = "  Greek Salad",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xFF1C1C1C),
                    lineHeight = 24.sp,
                    textAlign = TextAlign.Center
                )
            }

            Text(
                text = " $12.99  ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF1C1C1C),
                modifier = Modifier
                    .padding(start = 4.dp)
                    .background(Color(0x80CECECE))
                    .align(Alignment.BottomEnd)
                    .height(24.dp)
                    .wrapContentHeight()
            )
        }
    }
    return TODO("Provide the return value")
}


package com.example.littlelemon_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemsResLayout(){
    val ResWinSize = rememberWindowSize()
    when (ResWinSize.width) {
        WindowType.Compact ->{
            CompactItemsResLayout()
        } else -> {
            MediumItemsResLayout()
        }
    }

}

@Composable
fun CompactItemsResLayout() {
    LazyColumn (
        modifier = Modifier.fillMaxWidth()
    ){
        items(8){index ->
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(16.dp)
                    .height(200.dp)
                    .clip(RoundedCornerShape(32.dp))
                    .background(Color(0xFFFF6464)),
                 contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Item $index",
                    color = Color(0xFF0E0E0E),
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic
                )
            }

        }
    }
}


@Composable
fun MediumItemsResLayout() {
    LazyVerticalGrid (
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Adaptive(250.dp)
    ){
        items(8){index ->
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(16.dp)
                    .height(200.dp)
                    .clip(RoundedCornerShape(32.dp))
                    .background(Color(0xFFFF6464)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Item $index",
                    color = Color(0xFF0E0E0E),
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic
                )
            }

        }
    }
}

//
//@Composable
//fun ExpandedItemsResLayout() {
//    LazyColumn (
//        modifier = Modifier.fillMaxWidth()
//    ){
//        items(8){index ->
//            Box(
//                modifier = Modifier.fillMaxWidth()
//                    .padding(16.dp)
//                    .height(200.dp)
//                    .clip(RoundedCornerShape(32.dp))
//                    .background(Color(0xFFFF6464))
//                // contentAlignment = Alignment.Center
//            ){
//                Text(
//                    text = "Item $index",
//                    color = Color(0xFF0E0E0E),
//                    fontSize = 20.sp,
//                    fontStyle = FontStyle.Italic
//                )
//            }
//
//        }
//    }
//}
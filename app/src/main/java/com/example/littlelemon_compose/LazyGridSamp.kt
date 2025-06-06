package com.example.littlelemon_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun LazyGridSamp(){
    LazyVerticalGrid(columns = GridCells.Adaptive(150.dp)) {
        items(20){number ->
            //MenuGridCell(number)
            GalleryCell()
        }
    }
}

@Composable
fun MenuGridCell(number: Int){
    Card (
        modifier = Modifier.padding(12.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 16.dp),
    ) {
        Box (
            modifier = Modifier.aspectRatio(1f),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Item" + number,
                fontSize = 18.sp
                )

        }
    }
}
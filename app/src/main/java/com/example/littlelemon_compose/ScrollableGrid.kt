package com.example.littlelemon_compose

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ScrollableGrid(){
    Column {
        ScrollableRows()
        ScrollableColumn()
    }
}

@Composable
fun ScrollableCards(number: Int){
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp
            ),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = number.toString(),
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.fillMaxWidth()
                    .padding(16.dp)
            )
        }
}

@Composable
fun ScrollableColumn(){
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        repeat(20){
            ScrollableCards(number = it)
        }
    }
}

@Composable
fun ScrollableRows(){
    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState())
    ) {
        repeat(20){
            ScrollableCards(number = it)
        }
    }
}













// Scrollable Row in numbers
@Composable
fun ScrollableRow(){
    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState())
    ){
        repeat(20){
            Card(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 16.dp
                ),
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = it.toString(),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }

    }
}
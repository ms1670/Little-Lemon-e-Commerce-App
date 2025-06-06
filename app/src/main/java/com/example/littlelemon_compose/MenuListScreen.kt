@file:Suppress("DEPRECATION")

package com.example.littlelemon_compose

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@Preview(showBackground = true)
@Composable
fun MenuListScreen(navController: NavHostController) {
    Column {
        UpperPanel()
        LowerPanel(navController)
    }
}

@Preview(showBackground = true)
@Composable
private fun UpperPanel() {

//    Column(
//        modifier = Modifier
//            .background(Color(0xFF495E57))
//            .fillMaxWidth()
//            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
//    ) {
//        Text(
//            text = stringResource(id = R.string.title),
//            fontSize = 40.sp,
//            fontWeight = Bold,
//            color = Color(0xFFF4CE14)
//        )
//
//    }

    Column (
        Modifier.background(AppColors.AppCloud)
    ) {
        Text(
            text = stringResource(id = R.string.order_for_takeaway),
            fontSize = 24.sp,
            fontWeight = Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun LowerPanel(navController: NavHostController) {
    Column {
        LazyRow {
            items(Categories) { category ->
                MenuCategory(category)
            }
        }
        Divider(
            modifier = Modifier.padding(8.dp),
            color = Color.Gray,
            thickness = 0.8.dp
        )
        LazyColumn (
            Modifier
                .background(Color(0xFFE6DFEB))
        ) {
            items(Avl_Dishes) { Dish ->
                MenuList(Dish, onClick = {})
            }
        }
    }
}

@Composable
fun MenuCategory(category: String) {
    Row (
        modifier = Modifier
            .background(
                AppColors.AppCloud
               // Color(0xFFFFFFFF)
            )
    ) {
        Button(
            onClick = { /*TODO*/ },
            //colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.light_gray)),
            colors = ButtonDefaults.buttonColors(
              //  Color(0xFFFFFFFF)
               // Color(0x80495E57)
               containerColor = AppColors.AppYellow
            ),
            shape = RoundedCornerShape(32),
            modifier = Modifier.padding(4.dp)
        ) {
            Text(
                text = category,
                color =  AppColors.AppCharcoal
//                Color(
//                 //   0xFFFFFFFF
//                 //   0xFF020202
//                )
            )
        }
    }
}



//    Column (
//        modifier = Modifier.fillMaxSize()
//            .background(Color(0xFFC080FF))
//        ,
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Text(
//            text = "Menu List Screen",
//            fontSize = 32.sp
//        )
//    }

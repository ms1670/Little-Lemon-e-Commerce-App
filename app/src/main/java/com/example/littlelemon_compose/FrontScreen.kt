package com.example.littlelemon_compose

import android.graphics.fonts.FontStyle
import android.view.accessibility.CaptioningManager.CaptionStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun FrontScreen(
    navController: NavHostController = rememberNavController()
){
    Column {
        TopScreen(navController)
        BottomScreen(navController)
    }
}


@Preview(showBackground = true)
@Composable
fun TopScreen(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxWidth()
            .background(AppColors.AppGreen)
            .padding(top = 16.dp, bottom = 16.dp, start = 12.dp, end = 12.dp)
    ) {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = AppColors.AppYellow,
            textAlign = TextAlign.Start
        )

        Text(
            text = stringResource(id = R.string.location),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = AppColors.AppCloud,
            textAlign = TextAlign.Start
        )

        Row (
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(
                text = stringResource(id = R.string.app_description),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = AppColors.AppCloud,

                modifier = Modifier.fillMaxWidth(0.6f) // Allocate 60% of the row width
                    .padding(bottom = 32.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "Top Panel Image",
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
            )
        }

        Button(
           // onClick = {/* No navigation here */},
            onClick = {navController.navigate(MenuListScreen.route)},
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(AppColors.AppYellow),
        ) {
            Text(
                text = stringResource(id = R.string.order_btn_text),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BottomScreen(navController: NavHostController){
    Column {
        WeeklySpecialCard()
        AvlDishes(navController)
    }
}

@Composable
fun AvlDishes(navController: NavHostController){
    Column (
        Modifier.verticalScroll(rememberScrollState())
            .background(Color(0xFFE6DFEB))
    ){
        Avl_Dishes.forEach{
                Dish ->
            MenuList(Dish, onClick = {
                navController.navigate("DishDetailsScreen") // Navigate here
            })
            //MenuList(Dish, onClick = {})
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WeeklySpecialCard(){
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(0.dp),
        colors = CardDefaults.cardColors(containerColor =
        Color(0xFFE6DFEB)
        //Color(0x80495E57)
        )
    ) {
        Text(
            text = stringResource(id = R.string.weekly_special),
            fontSize = 28.sp,
            fontWeight = ExtraBold,
            color = AppColors.AppCharcoal,
            modifier = Modifier.padding(8.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MenuList(Dish: Dish, onClick:() -> Unit) {
    Card (
        Modifier
            .padding(top = 4.dp, bottom = 4.dp, start = 8.dp, end = 8.dp)
            .height(150.dp)
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF)),

    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        ) {
            Column (
              //  Modifier.padding(8.dp)
            ) {
                Text(
                    text = Dish.name,
                    fontSize = 18.sp,
                    fontWeight = Bold,
                    color = AppColors.AppCharcoal,
                )
                Text(
                    text = Dish.description,
                    color = AppColors.AppGreen,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 4.dp, end = 8.dp)
                        .fillMaxWidth(.65f)
                )
                Text(
                    text = Dish.price,
                    fontWeight = Bold,
                    color = AppColors.AppGreen,
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 4.dp)
                )
            }

            Image(
                painter = painterResource(id = Dish.image),
                contentDescription = "",
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                   // .fillMaxHeight()
                  //  .padding(8.dp)
                    .height(220.dp)

            )
        }
    }
//    HorizontalDivider(
//        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
//        thickness = 1.dp,
//        color = AppColors.AppYellow
//    )
}


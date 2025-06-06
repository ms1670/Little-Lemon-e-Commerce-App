package com.example.littlelemon_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Column {
        Scaffold(
            topBar = {
                TopBarApp()
            }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                NavRoutes(navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TopBarApp(){
    Box(
        modifier = Modifier.fillMaxWidth()
    ){
        IconButton(onClick = {/*ToDo*/},
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Image(
                contentDescription = "Menu Icon",
                painter = painterResource(id = R.drawable.ic_hamburger_menu)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier.fillMaxWidth(.45f)
                .align(Alignment.Center)

        )

        IconButton(onClick = {/*ToDo*/},
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            Image(
                contentDescription = "Cart Icon",
                painter = painterResource(id = R.drawable.ic_cart)
            )
        }
    }
}



//@Preview(showBackground = true)
//@Composable
//fun MainScreen(navController: NavHostController) {
//    Column (
//        modifier = Modifier.fillMaxSize()
//            .background(Color(0xFFFFE0E0))
//        ,
//
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Text(
//            text = "Home Screen",
//            fontSize = 32.sp
//        )
//        Button(
//            onClick = {
//                navController.navigate(MenuList.route)
//            },
//            colors = ButtonDefaults.buttonColors(
//                Color(0x6A3B2708)
//            )
//        ) {
//            Text(
//                text = "Menu List",
//                color = Color(0xFFDEDED1)
//            )
//        }
//
//    }
//}
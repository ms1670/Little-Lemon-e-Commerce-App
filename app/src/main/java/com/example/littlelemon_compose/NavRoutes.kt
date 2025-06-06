package com.example.littlelemon_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Preview(showBackground = true)
@Composable
fun NavRoutes(navController: NavHostController) {
    val navController: NavHostController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = FrontScreen.route
    )
    {
        composable(FrontScreen.route) {
            FrontScreen(navController)
        }

        //this going to work for both FrontScreen & MenuListScreen
        composable(DishDetailsScreen.route) {
            DishDetailsScreen()
        }

//        composable(
//            DishDetailsScreen.route + "/{${DishDetailsScreen.argDishId}}",
//            arguments = listOf(navArgument(DishDetailsScreen.argDishId) { type = NavType.IntType })
//        ) {
//            val id = requireNotNull(it.arguments?.getInt(DishDetailsScreen.argDishId)) { "Dish id is null" }
//            DishDetailsScreen(id)
//        }

        composable(MenuListScreen.route) {
            MenuListScreen(navController)
        }

    }
}

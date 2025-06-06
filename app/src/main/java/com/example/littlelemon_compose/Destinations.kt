package com.example.littlelemon_compose

interface Destinations {
    val route: String
}

object Main: Destinations{
    override val route = "MainScreen"
}

object TopScreen: Destinations{
    override val route = "TopScreen"
}

object FrontScreen: Destinations{
    override val route = "FrontScreen"
}

object MenuListScreen: Destinations{
    override val route = "MenuListScreen"
}

object DishDetailsScreen: Destinations{
    override val route = "DishDetailsScreen"
    const val argDishId = "dishId"
}
@file:OptIn(ExperimentalMaterial3Api::class)
@file:Suppress("DEPRECATION")

package com.example.littlelemon_compose

import android.R.attr.backdropColor
import android.R.attr.color
import android.R.attr.navigationIcon
import android.R.attr.numbersBackgroundColor
import android.R.attr.title
import android.R.color
import android.annotation.SuppressLint
import android.content.res.Configuration
import android.icu.text.CaseMap.*
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.BottomAppBarDefaults.windowInsets
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBarDefaults.colors
import androidx.compose.material3.Slider
import androidx.compose.material3.SnackbarDefaults
import androidx.compose.material3.SnackbarDefaults.color
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.TopAppBarState
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Brush

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.contentValuesOf
import androidx.core.graphics.red
import androidx.navigation.compose.rememberNavController
import org.jetbrains.annotations.Nls.Capitalization.Title
import kotlin.Int
import androidx.compose.foundation.isSystemInDarkTheme
import com.example.littlelemon_compose.ui.theme.DarkColorScheme
import com.example.littlelemon_compose.ui.theme.LightColorScheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
           HomeScreen()


            


//            LoginScreenDemo() // Login codes checked worked successfully
//            AppScreen(), ItemOrder() // 1 user input Counter codes worked (displayed form another page)
//            StepperBtn() // sample 1 user input Counter codes worked
//            AddItems()  // 2 user input Counter codes worked
//            UserInputForm() // user input demo codes worked
//            UpperPannel()
//            LowerPannel()
//            ResponsiveLayout() // Responsive layout based on 6 Texts
//            ProfileResLayout() // Profile Layout Responsive using Type Safe


        }
    }

}

//@Composable
//fun AppScreen(){
//    var count = rememberSaveable () {
//        mutableStateOf(0)
//    }
//    ItemOrder(count, {count.value++}, {count.value--})
//}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun HomeScreen () {
    Column {
        val navController = rememberNavController()
        MainScreen()
    }
    //ProfileResLayout()
    //ItemsResLayout()

    //AppScreen()
    //ResponsiveLayout(paddingValues = PaddingValues())
    //ResponsiveLayoutSwap(paddingValues = PaddingValues())
}

/// Old 1

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//
////            Text(
////                text = "Little Lemon Compose", fontSize = 36.sp,
////                color = Color(0xFFF555AB)
////            )
//
//            LittleLemon_composeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.primary
//                ) {
//                    RestaurantName(
//                        name = stringResource(id = R.string.name),
//                        size = 32
//                    )
//                }
//            }
//
//        }
//    }
//}
//
////    @Composable
////    fun RestaurantName(name: String, modifier: Modifier = Modifier) {
////        Text(
////            text = "App Name $name!",
////            modifier = modifier
////        )
////    }
//
//
//@Composable
//fun RestaurantName(name: String, size: Int) {
//    Text(
//        text = name,
//        fontSize = size.sp
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun RestaurantNamePreview() {
//    RestaurantName(
//        name = stringResource(id = R.string.name),
//        size = 32
//    )
//}
//
//
////    @Composable
////    fun Greeting(name: String) {
////        Text(text =  "Hello $name!")
////    }
//
////    @Preview(showBackground = true)
////    @Composable
////    fun DefaultPreview() {
////        ExercisesTheme {
////            Greeting("Android")
////        }
////    }



/// Old

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            LittleLemon_composeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    LittleLemon_composeTheme {
//        Greeting("Android")
//    }
//}



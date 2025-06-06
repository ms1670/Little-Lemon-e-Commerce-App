package com.example.littlelemon_compose

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TopAppBar() {
    Scaffold()
    { paddingValues ->
        Screen(
            modifier = Modifier.padding(paddingValues)
        )
    }
    }

fun rememberScaffoldState() {
    TODO("Not yet implemented")
}

@OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Screen(modifier: Modifier = Modifier){
        val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
            state = rememberTopAppBarState(),
        )

    Scaffold (
            modifier = Modifier,
            topBar = {
                TopBar(
                    scrollBehavior = scrollBehavior,

                )
            }
        ) {
                paddingValues ->
            ScreenContents(
                paddingValues = paddingValues
            )
        }
    }

    @Composable
    fun ScreenContents(paddingValues: @Composable PaddingValues) {

        Column (
            Modifier
                .padding(top = paddingValues.calculateTopPadding())
                .fillMaxWidth(),

            ) {
            UpperPannel()
            LowerPannel()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar(
        modifier: Modifier = Modifier,
        scrollBehavior: TopAppBarScrollBehavior,
    ){
        TopAppBar(
            modifier = modifier,
            //.padding(horizontal = 16.dp),
            scrollBehavior = scrollBehavior,
            colors = topAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(0.5f)
            ),
            windowInsets = WindowInsets(top = 0.dp)
            ,
            title = {
                Text(
                    text = "Little Lemon",
                    color = MaterialTheme.colorScheme.onBackground.copy(0.7f),
                    fontSize = 20.sp
                )
            },

            navigationIcon = {
//            Icon(
//                imageVector = Icons.Rounded.Menu,
//                contentDescription= "",
//                modifier = Modifier
//                    .padding(start = 12.dp, end = 8.dp)
//                    .size(32.dp)
//            )
                IconButton(onClick = { } ) {
                    Image(painter = painterResource(id = R.drawable.ic_menu), contentDescription = "Menu")
                }
            },

            actions = {
                Icon(
                    imageVector = Icons.Rounded.ShoppingCart,
                    contentDescription= "",
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(32.dp)
                )
                Icon(
                    imageVector = Icons.Rounded.AccountCircle,
                    contentDescription= "",
                    modifier = Modifier
                        .padding(start = 12.dp, end = 8.dp)
                        .size(32.dp)
                )
            }
        )

    }


//    Row () {
//            IconButton(onClick = { }) {
//               // Icon(Icons.Default.Search, contentDescription = "Search")
//                Image(painter = painterResource(id = R.drawable.ic_menu), contentDescription = "Menu")
//            }
//            Image(painter = painterResource(id = R.drawable.top_bar_logo), contentDescription = "App Bar Logo"
//                    , modifier = Modifier.height(60.dp)
//            )
//            IconButton(onClick = { }) {
//                //Icon(Icons.Default.ShoppingCart, contentDescription = "Search")
//                Image(painter = painterResource(id = R.drawable.ic_cart), contentDescription = "Menu")
//            }
//    }

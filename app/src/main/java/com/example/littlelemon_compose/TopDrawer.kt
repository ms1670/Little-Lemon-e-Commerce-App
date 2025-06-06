package com.example.littlelemon_compose

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TopDrawer(){
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed
        )
        val scope = rememberCoroutineScope()

        val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
            state = rememberTopAppBarState(),
        )

        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet (
                    //    modifier = Modifier.background(Color(0xFF5EB3AD))
                    //  modifier = Modifier.background(Color(0xFFB40000))
                    //modifier = Modifier.background(brush = Brush.verticalGradient(colors = listOf(Color.Blue, Color.Cyan)))
                )
                {
                    DrawerContent()
                }
            },
            gesturesEnabled = true,
            scrimColor = Color(0xFF347F8C).copy(0.5f),
        ) {
            Scaffold(
                // modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),

                topBar = {
                    TopBar(
                        onOpenDrawer = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        },
                        scrollBehavior = scrollBehavior,
                    )
                }
            ) { paddingValues ->
                ScreenContent(
                    paddingValues = paddingValues
                )
            }
        }
    }

    @Suppress("DEPRECATION")
    @Composable
    fun ScreenContent(paddingValues: @Composable PaddingValues) {
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF34808D)),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(top = paddingValues.calculateTopPadding() + 12.dp)

        ){
            items(10){
                Box(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .height(200.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(MaterialTheme.colorScheme.inversePrimary)
                )


                // Card 1
//                Card (
//                    modifier = Modifier.fillMaxWidth()
//                        .padding(horizontal = 16.dp, vertical = 8.dp)
//                        .clip(RoundedCornerShape(16.dp))
//                    ,
//                    onClick = {},
//                ) {
//                    Row(
//                        modifier = Modifier.fillMaxWidth()
//                            .background(MaterialTheme.colorScheme.inversePrimary)
//                            //.height(200.dp)
//                        //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
//                    )
//                    {
//                        Column() {
//                            Text(
//                                text = "",
//                                fontWeight = FontWeight.Bold,
//                                fontSize = 16.sp,
//                                //modifier = Modifier.padding(8.dp)
//                            )
//
//                            Text(
//                                text = stringResource(R.string.dish1_des),
//                                fontWeight = FontWeight.Bold,
//                                fontSize = 12.sp,
//                                color = Color.Gray,
//                                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp).fillMaxWidth(.70f)
//                            )
//
//                            Text(
//                                text = "$12.99",
//                                color = Color.Gray,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                        Image(
//                            painter = painterResource(id = R.drawable.greeksalad), contentDescription = "",
//                            Modifier.clip(RoundedCornerShape(12.dp))
//                                .height(150.dp).padding(horizontal = 4.dp)
//                        )
//
//                    }
//
//                }

                Spacer(modifier = Modifier.height(16.dp))


            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DrawerContent(modifier: Modifier = Modifier) {
        Column (
            modifier = Modifier
                .background(Color(0xFF5EB4AE))
                .fillMaxWidth()
                .height(80.dp),
            verticalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "App Name",
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        HorizontalDivider()

        Column (
            modifier = Modifier .background(Color(0xFF347F8C))
                .fillMaxSize()
                .fillMaxWidth()

        ) {
            NavigationDrawerItem( //Profile
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Profile",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(27.dp)
                            .background(Color(0xFFFFFFFF))
                    )
                },

                label = {
                    Text(
                        text = "My Profile",
                        fontSize = 17.sp,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(8.dp)
                    )
                },

                onClick = {},
                selected = true,

                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor  = Color(0xFF5EB3AD),
                    unselectedContainerColor  = Color.Transparent

                )

                //modifier = Modifier.background(Color(0xFF5EB3AD))


            )

            NavigationDrawerItem( //Inbox
                icon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Inbox",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(27.dp)
                    )
                },

                label = {
                    Text(
                        text = "Inbox",
                        fontSize = 17.sp,
                        modifier = Modifier.padding(8.dp)
                    )
                },

                onClick = {},
                selected = false
            )

            NavigationDrawerItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(27.dp)
                    )
                },

                label = {
                    Text(
                        text = "Notifications",
                        fontSize = 17.sp,
                        modifier = Modifier.padding(8.dp)
                    )
                },

                onClick = {},
                selected = false
            )

            NavigationDrawerItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(27.dp)

                    )
                },

                label = {
                    Text(
                        text = "Settings",
                        fontSize = 17.sp,
                        modifier = Modifier.padding(8.dp)
                    )
                },

                onClick = {},
                selected = false
            )
        }
    }

//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            contentDescription = "",
//            //modifier = Modifier.size(height = 30.dp, width = 600.dp)
//
//        )



    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar(
        onOpenDrawer: () -> Unit, scrollBehavior: TopAppBarScrollBehavior,
    ) {
        TopAppBar(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomEnd = 16.dp,
                        bottomStart = 16.dp
                    )
                )
            //.background(Color(0xFFF44336))
            ,
            scrollBehavior = scrollBehavior,
            colors = TopAppBarDefaults.topAppBarColors(
                //containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(0.6f)
                // containerColor = Color.Blue.copy(0.6f)
                // containerColor = Color.Transparent
                containerColor = Color(color = 0xFF79D9C7).copy(0.6f)
            ),
            windowInsets = WindowInsets(top = 0.dp),

            navigationIcon = {
                Icon(
                    imageVector = Icons.Rounded.Menu,
                    contentDescription = "menu",
                    modifier = Modifier
                        .padding(start = 12.dp, end = 8.dp)
                        .size(32.dp)
                        .clickable {
                            onOpenDrawer()
                        }
                    //  .background(Color(0x45FFCA2B))
                )
            },
            title = {
                Text(text = "App Name")
            },
            actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "menu",
                    modifier = Modifier
                        .padding(start = 12.dp, end = 8.dp)
                        .size(32.dp)
                )

                Icon(
                    imageVector = Icons.Rounded.AccountCircle,
                    contentDescription = "menu",
                    modifier = Modifier
                        .padding(start = 12.dp, end = 8.dp)
                        .size(32.dp)
                )
            }
        )
    }

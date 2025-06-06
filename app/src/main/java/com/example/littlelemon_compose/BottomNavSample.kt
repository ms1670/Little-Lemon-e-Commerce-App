@file:Suppress("DEPRECATION")

package com.example.littlelemon_compose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.ImageVector

@SuppressLint("AutoboxingStateCreation")
@Preview(showBackground = true)
@Composable
fun BottomNavSample() {
    var selected by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                bottomNavItems.forEachIndexed { index, bottomNavItem ->
                    NavigationBarItem(
                        selected = index == selected,
                        onClick = {
                            selected = index
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    if (bottomNavItem.badges != 0) {
                                        Badge {
                                            Text(text = bottomNavItem.badges.toString())
                                        }
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                    contentDescription = bottomNavItem.title
                                )
                            }
                        },
                        label = {
                            Text(text = bottomNavItem.title)
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            // Add content for the selected screen here
            when (selected) {
                0 -> HomeScreen()
                1 -> Text ("MenuListScreen")
                2 -> Text("Notifications Screen")
                3 -> ProfileResLayout()
           }


//            when (selected) {
//                0 -> Text("Home Screen")
//                1 -> Text("Call Screen")
//                2 -> Text("Notifications Screen")
//                3 -> Text("Profile Screen")
//            }
        }
    }
}

data class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badges: Int
)

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route = "home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        badges = 0
    ),
    BottomNavItem(
        title = "Dishes",
        route = "dishes",
        selectedIcon = Icons.Filled.List,
        unselectedIcon = Icons.Outlined.List,
        badges = 0
    ),
    BottomNavItem(
        title = "Notifications",
        route = "notifications",
        selectedIcon = Icons.Filled.Notifications,
        unselectedIcon = Icons.Outlined.Notifications,
        badges = 15
    ),
    BottomNavItem(
        title = "Profile",
        route = "profile",
        selectedIcon = Icons.Filled.AccountCircle,
        unselectedIcon = Icons.Outlined.AccountCircle,
        badges = 0
    )
)

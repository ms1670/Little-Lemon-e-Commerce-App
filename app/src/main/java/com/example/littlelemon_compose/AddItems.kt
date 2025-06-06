@file:Suppress("DEPRECATION")

package com.example.littlelemon_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import  androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun AddItems() {
    var count_GreekSalad = rememberSaveable() {
        mutableStateOf(0)
    }
    var count_Pizza = rememberSaveable() {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(elevation = CardDefaults.cardElevation(defaultElevation = 32.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF79D9C7))
            )
            {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Greek Salad",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.W700,
                        textAlign = TextAlign.Center
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextButton(onClick = { count_GreekSalad.value = count_GreekSalad.value - 1 }) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = "Add"
                            )
                        }
                        Text(
                            text = "${count_GreekSalad.value}", Modifier.size(42.dp), fontSize = 32.sp,
                            textAlign = TextAlign.Center
                        )

                        TextButton(onClick = { count_GreekSalad.value = count_GreekSalad.value + 1 }) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add"
                            )
                        }

                    }
                    Button(onClick = {/*Todo*/ }, Modifier.fillMaxWidth()) {
                        Text(text = "Add")
                    }

                }
            }  // Card Greek Salad ends


        Divider(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            color = Color.LightGray,
            thickness = 1.dp
        )

        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 32.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFCE7B43))
        )
        {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = "Pizza",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.W700,
                    textAlign = TextAlign.Center
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = { count_Pizza.value = count_Pizza.value - 1 }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Add"
                        )
                    }
                    Text(
                        text = "${count_Pizza.value}", Modifier.size(42.dp), fontSize = 32.sp,
                        textAlign = TextAlign.Center
                    )

                    TextButton(onClick = { count_Pizza.value = count_Pizza.value + 1 }) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add"
                        )
                    }

                }
                Button(onClick = {/*Todo*/ }, Modifier.fillMaxWidth()) {
                    Text(text = "Add")
                }

            }
        } // Card Pizza ends
        }
}
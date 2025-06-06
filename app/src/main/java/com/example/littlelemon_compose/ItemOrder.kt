@file:Suppress("DEPRECATION")

package com.example.littlelemon_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
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
fun ItemOrder(count: MutableState<Int>, onIncrement: () -> Unit, onDecrment: () -> Unit) {
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
                    TextButton(onClick = { onDecrment() }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Add"
                        )
                    }
                    Text(
                        text = "${count.value}", Modifier.size(42.dp), fontSize = 32.sp,
                        textAlign = TextAlign.Center
                    )

                    TextButton(onClick = { onIncrement() }) {
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
    }
}

package com.example.littlelemon_compose

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Preview(showBackground = true)
@Composable
fun ResponsiveLayout(paddingValues: PaddingValues){
    Surface (modifier = Modifier.padding(paddingValues)) {
        val menuPadding = 8.dp
        val configuration = LocalConfiguration.current
        when (configuration.orientation){
                ORIENTATION_LANDSCAPE ->{
                    Column {
                        Row (
                            modifier = Modifier.weight(0.5f)
                        ){
                            Text(text = "R1",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCCEF0000))
                                    .padding(menuPadding)

                            )
                            Text(text = "R2",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCCF58F2B))
                                    .padding(menuPadding)
                            )
                            Text(text = "R3",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCCFFFF00))
                                    .padding(menuPadding)

                            )

                        }

                        Row (modifier = Modifier.weight(0.5f)) {

                            Text(text = "R4",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCC00FF00))
                                    .padding(menuPadding)

                            )
                            Text(text = "R5",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCC0000FF))
                                    .padding(menuPadding)

                            )
                            Text(text = "R6",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCC4B0082))
                                    .padding(menuPadding)
                            )
                            Text(text = "R7",
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxHeight()
                                    .background(Color(0xCC9400D3))
                                    .padding(menuPadding)
                            )
                        }
                    }
                }

            else -> {
                Column{
                    Text(text = "One",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCCEF0000))
                            .padding(menuPadding)

                    )
                    Text(text = "Two",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCCF58F2B))
                            .padding(menuPadding)

                    )

                    Text(text = "Three",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCCFFFF00))
                            .padding(menuPadding)

                    )
                    Text(text = "Four",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCC00FF00))
                            .padding(menuPadding)

                    )

                    Text(text = "Five",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCC0000FF))
                            .padding(menuPadding)

                    )
                    Text(text = "Six",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCC4B0082))
                            .padding(menuPadding)
                    )
                    Text(text = "Seven",
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xCC9400D3))
                            .padding(menuPadding)
                    )
                }
            }
        }
    }
}
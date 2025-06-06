@file:Suppress("DEPRECATION")

package com.example.littlelemon_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun LowerPannel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}

@Composable
fun WeeklySpecial() {
    Card (modifier = Modifier.fillMaxWidth(),
            ) {
        Text(
            text = stringResource(R.string.weekly_special),
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
            modifier = Modifier.padding(8.dp),
        )

    }
}

@Composable
fun MenuDish() {
    //Card 1
    Column(
        Modifier.verticalScroll(rememberScrollState())
    ) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
            )
            {
                Column() {
                    Text(
                        text = stringResource(R.string.dish1),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        //modifier = Modifier.padding(8.dp)
                    )

                    Text(
                        text = stringResource(R.string.dish1_des),
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 5.dp, bottom = 5.dp).fillMaxWidth(.70f)
                    )

                    Text(
                        text = "$12.99",
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.greeksalad), contentDescription = "",
                    Modifier.clip(RoundedCornerShape(12.dp))
                        .height(100.dp).padding(horizontal = 4.dp)
                )

                Divider(
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                    color = Color.LightGray,
                    thickness = 1.dp
                )

            }
        }
        //Card 2
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
            )
            {
                Column() {
                    Text(
                        text = stringResource(R.string.dish2),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        //modifier = Modifier.padding(8.dp)
                    )

                    Text(
                        text = stringResource(R.string.dish2_des),
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 5.dp, bottom = 5.dp).fillMaxWidth(.70f)
                    )

                    Text(
                        text = "$12.99",
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.burger), contentDescription = "",
                    Modifier.clip(RoundedCornerShape(12.dp))
                        .height(100.dp).padding(horizontal = 4.dp)
                )

                Divider(
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                    color = Color.LightGray,
                    thickness = 1.dp
                )

            }

            //Card 3
            Card(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
                )
                {
                    Column() {
                        Text(
                            text = stringResource(R.string.dish1),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            //modifier = Modifier.padding(8.dp)
                        )

                        Text(
                            text = stringResource(R.string.dish1_des),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
                                .fillMaxWidth(.70f)
                        )

                        Text(
                            text = "$12.99",
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.greeksalad),
                        contentDescription = "",
                        Modifier.clip(RoundedCornerShape(12.dp))
                            .height(100.dp).padding(horizontal = 4.dp)
                    )

                    Divider(
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                        color = Color.LightGray,
                        thickness = 1.dp
                    )

                }
            }

            //Card 4
            Card(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
                )
                {
                    Column() {
                        Text(
                            text = stringResource(R.string.dish2),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            //modifier = Modifier.padding(8.dp)
                        )

                        Text(
                            text = stringResource(R.string.dish2_des),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
                                .fillMaxWidth(.70f)
                        )

                        Text(
                            text = "$12.99",
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.burger), contentDescription = "",
                        Modifier.clip(RoundedCornerShape(12.dp))
                            .height(100.dp).padding(horizontal = 4.dp)
                    )

                    Divider(
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                        color = Color.LightGray,
                        thickness = 1.dp
                    )

                }

                //Card 5
                Card(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
                    )
                    {
                        Column() {
                            Text(
                                text = stringResource(R.string.dish1),
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                //modifier = Modifier.padding(8.dp)
                            )

                            Text(
                                text = stringResource(R.string.dish1_des),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Gray,
                                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
                                    .fillMaxWidth(.70f)
                            )

                            Text(
                                text = "$12.99",
                                color = Color.Gray,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.greeksalad),
                            contentDescription = "",
                            Modifier.clip(RoundedCornerShape(12.dp))
                                .height(100.dp).padding(horizontal = 4.dp)
                        )

                        Divider(
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                            color = Color.LightGray,
                            thickness = 1.dp
                        )

                    }
                }

                //Card 6
                Card(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        //.padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 4.dp)
                    )
                    {
                        Column() {
                            Text(
                                text = stringResource(R.string.dish2),
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                //modifier = Modifier.padding(8.dp)
                            )

                            Text(
                                text = stringResource(R.string.dish2_des),
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.Gray,
                                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
                                    .fillMaxWidth(.70f)
                            )

                            Text(
                                text = "$12.99",
                                color = Color.Gray,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.burger),
                            contentDescription = "",
                            Modifier.clip(RoundedCornerShape(12.dp))
                                .height(100.dp).padding(horizontal = 4.dp)
                        )

                        Divider(
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                            color = Color.LightGray,
                            thickness = 1.dp
                        )

                    }
                }
            }
        }
    }
}

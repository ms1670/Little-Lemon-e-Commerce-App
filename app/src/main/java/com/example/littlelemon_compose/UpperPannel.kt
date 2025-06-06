package com.example.littlelemon_compose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat
import java.security.AllPermission


@Preview(showBackground = true)
@Composable
fun UpperPannel() {
    val context = LocalContext.current
    Column (
        verticalArrangement = Arrangement.Top
        , horizontalAlignment = Alignment.Start
        , modifier = Modifier
            .fillMaxWidth() //.padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 8.dp)
            .background(Color(0xff495E57))
    )
    {
        Text( // Name
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF555AB),
            modifier = Modifier.padding(start = 16.dp, top = 16.dp),
        )
        Text( // Place
            text = stringResource(R.string.chicago),
            fontSize = 24.sp,
            color = Color(0xFF00080D),
            modifier = Modifier.padding(start = 16.dp),
        )
        Row (
            Modifier //.padding(start = 16.dp, end = 16.dp)
            , horizontalArrangement = Arrangement.Start)
        {
            Text(text = stringResource(id = R.string.description1)
                , Modifier.fillMaxWidth(.60f) .padding(start = 16.dp)
                , color = Color.White
                , fontSize = 18.sp
            )

            Image(  painter = painterResource(id = R.drawable.burger)
                , contentDescription = ""
                ,
                Modifier
                    .height(145.dp)
                    .clip(RoundedCornerShape(12.dp))

            )
        }
            Button(
                onClick = {
                    Toast.makeText(context, "Order Placed...", Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.padding(start = 20.dp, bottom = 20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF4CE14))
                )
            {
                Text(
                    text = stringResource(R.string.order),
                    color = Color(0xFF00080D),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
    }
}

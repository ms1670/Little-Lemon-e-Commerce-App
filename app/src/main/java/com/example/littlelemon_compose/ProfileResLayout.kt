package com.example.littlelemon_compose

import android.R.attr.id
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ProfileResLayout(){
    val ResWinSize = rememberWindowSize()
    when (ResWinSize.width) {
        WindowType.Compact ->{
            CompactProfileResLayout()
        } else -> {
        MediumToExpandedProfileResLayout()
    }
    }
}

@Composable
fun CompactProfileResLayout(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .size(180.dp)
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "Ms",
                color = MaterialTheme.colorScheme.inversePrimary,
                fontSize = 80.sp
            )

            Image(
                painter = painterResource(id = R.drawable.burger)
                , contentDescription = "",
                Modifier .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
            )

        }

        Spacer(modifier = Modifier.height(64.dp))

        UserInfo(
            title = "Position",
            content = "App Developer"
        )
        UserInfo(
            title = "Email",
            content = "Developer@email.com"
        )
        UserInfo(
            title = "Contact",
            content = "1234567890"
        )
    }
}

@Composable
fun MediumToExpandedProfileResLayout(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .size(180.dp)
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                   // .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Ms",
                    color = MaterialTheme.colorScheme.inversePrimary,
                    fontSize = 80.sp
                )
            }

            Spacer(modifier = Modifier.width(100.dp))

            Column {
                UserInfo(
                    title = "Ms",
                    content = "App Developer"
                )

                UserInfo(
                    title = "Email",
                    content = "Developer@email.com"
                )

                UserInfo(
                    title = "Contact",
                    content = "1234567890"
                )
            }
        }
    }
}


@Composable
fun UserInfo(title: String, content : String ) {
    Text(
        modifier = Modifier.alpha(0.7f),
        text = title,
        color = MaterialTheme.colorScheme.onBackground,
        fontSize = 16.sp
    )
    Spacer(modifier = Modifier.height(6.dp))

    Text(
        text = content,
        color = MaterialTheme.colorScheme.onBackground,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    )
    Spacer(modifier = Modifier.height(32.dp))
}
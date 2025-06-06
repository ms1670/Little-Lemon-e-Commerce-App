package com.example.littlelemon_compose

import android.R.attr.color
import android.R.attr.password
import android.R.attr.value
import android.R.color
import android.R.string
import android.annotation.SuppressLint
import android.graphics.Color.red
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.input.TextFieldValue
import androidx.core.graphics.blue
import androidx.core.graphics.red
import kotlin.reflect.typeOf

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun LoginScreenDemo() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize() .background(color = Color(0xFF69DAFF))
    )
    {
        var username = remember { mutableStateOf("") }
        var password = remember { mutableStateOf("") }

        Image(
            painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = "Logo Image",
            modifier = Modifier.padding(10.dp)
        )

        TextField(
            value = username.value,
            onValueChange = /*{username = it} */{ username.value = it},
            label ={ Text(text = "User Name") },
            modifier = Modifier.padding(10.dp)
            )

        TextField(
            value = password.value,
            onValueChange = {password.value = it},
            label ={ Text(text = "Password") },
            modifier = Modifier.padding(10.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )

        Row {
            val context = LocalContext.current
            Button(onClick = { /*TODO*/

                Log.d("AAA", buildString { append(username.value.toString()) })
                Log.d("AAA", password.value)

                if(username.value.toString() == "admin" && password.value.toString()=="admin"){
                Toast.makeText(context,"Welcome to Little Lemon!",Toast.LENGTH_LONG).show()
                }
                else {
                Toast.makeText(context,"Invalid credentials.\"\n"+""+"\"Please try again.",Toast.LENGTH_LONG).show()
                }
             //     Toast.makeText(context, "Welcome to Little Lemon!", Toast.LENGTH_SHORT).show()
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFDC2929))
                , border = BorderStroke(1.dp, Color(0xFFDC2929))
                , shape = RoundedCornerShape(12.dp)
                , modifier = Modifier.padding(end = 16.dp)
        ) {
            Text(
                text = "Log In",
                color = Color(0xFFEDEFEE)
            )
        }

        Button(
            onClick = {
                Toast.makeText(context, "Please Wait...", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF495E57))
            , border = BorderStroke(1.dp, Color(0xFF495E57))
            , shape = RoundedCornerShape(12.dp)

        ) {
            Text(
                text = "Sign Up",
                color = Color(0xFFEDEFEE)
            )
        }
        }
    }
}
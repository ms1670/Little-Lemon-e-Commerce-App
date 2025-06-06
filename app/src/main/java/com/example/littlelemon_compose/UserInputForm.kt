package com.example.littlelemon_compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun UserInputForm(){  // user Input demo codes worked
    Column () {
   //     var email = remember { mutableStateOf("") } // Correctly initialize state for email
       // var username = remember { mutableStateOf("") } // Correctly initialize state for username
        var username = remember { mutableStateOf("") }
        var email = remember { mutableStateOf("") }

        TextField(
            value = email.value, // Bind value to email state
            onValueChange = { newemail -> email.value = newemail}, // Update email state
            label = { Text(text = "Email") },
        )

     //   Text(text = "You typed: $email", style = MaterialTheme.typography)

        TextField(
            value = username.value, // Bind value to username state
            onValueChange = { username }, // Update username state
            label = { Text("User Name") }
        )
    }
}

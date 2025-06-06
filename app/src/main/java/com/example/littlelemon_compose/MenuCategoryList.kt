package com.example.littlelemon_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MenuCategoryList(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        AppCategories.forEach{
            MenuCategoryBtn(category = it)
        }
    }

//    Column (
//        modifier = Modifier.fillMaxHeight()
//    ) {
//        AppCategories.forEach{
//            MenuCategoryBtn(category = it)
//        }
//    }
}

@Composable
fun MenuCategoryBtn(category: String){
    Button(
        onClick = {/*ToDO*/},
        colors = ButtonDefaults.buttonColors(
            containerColor  = Color(0xFFA9A9A9)
        ),
        shape = RoundedCornerShape(32),
        modifier = Modifier.padding(6.dp),
    ) {
        Text(
            text = category,
            color = Color(0xFF131313)
        )
    }
}

val AppCategories = listOf<String>(
        "Lunch",
        "Dessert",
        "Mains"
)

@Preview(showBackground = true)
@Composable
fun MenuCategoryListPreview(){
    MenuCategoryBtn(category = "App Categories")
}


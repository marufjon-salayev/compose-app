package com.android.composeapp

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Calculator(
    context: Context = LocalContext.current
) {

    fun toast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    var string = remember { mutableStateOf("0") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = string.value, fontSize = 26.sp)
        Row {
            Button(
                onClick = { string.value = "1" },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Green,
                    contentColor = Color(0xFFDC4949)
                )
            ) {
                Text(text = "1")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = {  string.value = "2" }) {
                Text(text = "2")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = {  string.value = "3" }) {
                Text(text = "3")
            }
        }

        Row {
            Button(onClick = { string.value = "4" }) {
                Text(text = "4")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { string.value = "5"  }) {
                Text(text = "5")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { string.value = "6" }) {
                Text(text = "6")
            }
        }

        Row {
            Button(onClick = { string.value = "7" }) {
                Text(text = "7")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { string.value = "8" }) {
                Text(text = "8")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { string.value = "9" }) {
                Text(text = "9")
            }
        }
    }
}


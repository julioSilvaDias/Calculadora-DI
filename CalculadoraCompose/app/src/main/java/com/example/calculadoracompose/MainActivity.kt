package com.example.calculadoracompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoracompose.ui.theme.CalculadoraComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android", modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun calculadoraInterface() {
    val tamanioFuentaboton = 18.sp

    Column(modifier = Modifier.fillMaxHeight()) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            TextField(
                modifier = Modifier.weight(1f).padding(bottom = 30.dp, top = 10.dp),
                value = "",
                onValueChange={},
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "AC",
                    fontSize = tamanioFuentaboton,
                    modifier = Modifier.wrapContentSize()
                )
            }


            Button(modifier = Modifier
                .weight(2f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "COMPARTIR",
                    fontSize = tamanioFuentaboton,
                    modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Blue
                ),
                onClick = {

                }) {
                Text(
                    text = "/", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "7", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "8", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "9", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Blue
                ),
                onClick = {

                }) {
                Text(
                    text = "X", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "4", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "5", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "6", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Blue
                ),
                onClick = {

                }) {
                Text(
                    text = "-", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "1", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "2", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "3", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Blue
                ),
                onClick = {

                }) {
                Text(
                    text = "+", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(modifier = Modifier
                .weight(2f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = "0", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Black
                ),
                onClick = {

                }) {
                Text(
                    text = ".", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }

            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Blue
                ),
                onClick = {

                }) {
                Text(
                    text = "=", fontSize = tamanioFuentaboton, modifier = Modifier.wrapContentSize()
                )
            }
        }
    }
}
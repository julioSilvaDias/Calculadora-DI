package com.example.calculadoracompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraEstado()
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Preview(
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
fun CalculadoraEstado() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            calculadoraInterfaceLandscape()
        } else -> {
            calculadoraInterface()
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun calculadoraInterface() {
    val tamanioFuentaboton = 18.sp
    var text by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(androidx.compose.ui.graphics.Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            TextField(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 110.dp, top = 100.dp)
                    .height(200.dp),
                value = text,
                onValueChange = {
                    text = it
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text
                ),
                textStyle = TextStyle(
                    textAlign = TextAlign.End,
                    fontSize = 60.sp,
                    color = androidx.compose.ui.graphics.Color.Black
                ),


                colors = TextFieldDefaults.textFieldColors(
                    containerColor = androidx.compose.ui.graphics.Color.Transparent,
                    unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
                    focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
                ),
                readOnly = true

            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp)
        ) {
            Button(modifier = Modifier
                .weight(1f)
                .height(70.dp)
                .padding(2.dp),
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor = androidx.compose.ui.graphics.Color.Blue
                ),
                onClick = {
                    text = ""

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
                    containerColor = androidx.compose.ui.graphics.Color.Blue
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
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp)
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
                    text += "7"

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
                    text += "8"
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
                    text += "9"

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
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp)
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
                    text += "4"

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
                    text += "5"

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
                    text += "6"

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
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp)
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
                    text += "1"

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
                    text += "2"

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
                    text += "3"

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
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, top = 10.dp)
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
                    text += "0"

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


@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun calculadoraInterfaceLandscape() {
    val fontSize = 18.sp
    var text by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .weight(1f),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                TextField(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    value = text,
                    onValueChange = {
                        text = it
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text
                    ),
                    textStyle = TextStyle(
                        textAlign = TextAlign.End,
                        fontSize = 60.sp,
                        color = androidx.compose.ui.graphics.Color.Black
                    ),


                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = androidx.compose.ui.graphics.Color.Transparent,
                        unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
                        focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
                    ),
                    readOnly = true

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 6.dp)
            ) {
                Button(modifier = Modifier
                    .weight(1f)
                    .height(70.dp)
                    .padding(2.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = androidx.compose.ui.graphics.Color.Blue
                    ),
                    onClick = {
                        text = ""

                    }) {
                    Text(
                        text = "AC",
                        fontSize = fontSize,
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
                        text = "COMPARTIR",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 6.dp)
            ) {
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
                        text = "+",
                        fontSize = fontSize,
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
                        text = "-",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 6.dp)
            ) {
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
                        text = "/",
                        fontSize = fontSize,
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
                        text = "X",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }

            }


        }

        Column(
            modifier = Modifier
                .weight(1f),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 20.dp)
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
                        text += "7"

                    }) {
                    Text(
                        text = "7",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text += "8"
                    }) {
                    Text(
                        text = "8",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text += "9"

                    }) {
                    Text(
                        text = "9",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 6.dp)
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
                        text += "4"

                    }) {
                    Text(
                        text = "4",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text += "5"

                    }) {
                    Text(
                        text = "5",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text += "6"

                    }) {
                    Text(
                        text = "6",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 6.dp)
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
                        text += "1"

                    }) {
                    Text(
                        text = "1",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text += "2"

                    }) {
                    Text(
                        text = "2",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text += "3"

                    }) {
                    Text(
                        text = "3",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp, top = 6.dp)
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
                        text += "0"

                    }) {
                    Text(
                        text = "0",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
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
                        text = ".",
                        fontSize = fontSize,
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
                        text = "=",
                        fontSize = fontSize,
                        modifier = Modifier.wrapContentSize()
                    )
                }

            }

        }
    }


}


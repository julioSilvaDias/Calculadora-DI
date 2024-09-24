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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
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
        }

        else -> {
            calculadoraInterface()
        }

    }
}

@Composable
fun calculadoraInterface() {
    var text by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(androidx.compose.ui.graphics.Color.White)
    ) {
        generarTextField(text = text, onTextChange = { text = it }, 0, 110, 100, 200, 80)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp)
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
                    text = "AC", fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                    text = "COMPARTIR", fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                    text = "/", fontSize = 18.sp, modifier = Modifier.wrapContentSize()
                )
            }
        }

        generarFilasCalculadoraVertical(
            text = text,
            onTextChange = { newText -> text = newText },
            btn1 = "7",
            btn2 = "8",
            btn3 = "9",
            btn4 = "X"
        )

        generarFilasCalculadoraVertical(
            text = text,
            onTextChange = { newText -> text = newText },
            btn1 = "4",
            btn2 = "5",
            btn3 = "6",
            btn4 = "-"
        )

        generarFilasCalculadoraVertical(
            text = text,
            onTextChange = { newText -> text = newText },
            btn1 = "1",
            btn2 = "2",
            btn3 = "3",
            btn4 = "+"
        )



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp)
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
                    text = "0", fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                    text = ".", fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                    text = "=", fontSize = 18.sp, modifier = Modifier.wrapContentSize()
                )
            }
        }
    }
}

@Composable
fun calculadoraInterfaceLandscape() {
    val fontSize = 18.sp
    var text by rememberSaveable { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier.weight(1f), verticalArrangement = Arrangement.SpaceEvenly
        ) {

            generarTextField(text = text, onTextChange = { text = it }, 2, 0, 0, 80, 45)

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
                        text = "AC", fontSize = fontSize, modifier = Modifier.wrapContentSize()
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
            generarFilasOperacionesHorizontal("/", "X")
            generarFilasOperacionesHorizontal("-", "+")
        }

        Column(
            modifier = Modifier.weight(1f), verticalArrangement = Arrangement.SpaceEvenly
        ) {
            generarFilaHorizontal(
                text = text,
                onTextChange = { newText -> text = newText },
                btn1 = "7",
                btn2 = "8",
                btn3 = "9",
            )

            generarFilaHorizontal(
                text = text,
                onTextChange = { newText -> text = newText },
                btn1 = "4",
                btn2 = "5",
                btn3 = "6",
            )

            generarFilaHorizontal(
                text = text,
                onTextChange = { newText -> text = newText },
                btn1 = "1",
                btn2 = "2",
                btn3 = "3",
            )
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
                        text = "0", fontSize = fontSize, modifier = Modifier.wrapContentSize()
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
                        text = ".", fontSize = fontSize, modifier = Modifier.wrapContentSize()
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
                        text = "=", fontSize = fontSize, modifier = Modifier.wrapContentSize()
                    )
                }

            }

        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun generarTextField(
    text: String,
    onTextChange: (String) -> Unit,
    padding1: Int,
    padding2: Int,
    padding3: Int,
    altura: Int,
    fontSize: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(padding1.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = padding2.dp, top = padding3.dp)
                .height(altura.dp),

            value = text, onValueChange = {
                onTextChange(it)
            }, keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text
            ), textStyle = TextStyle(
                textAlign = TextAlign.End,
                fontSize = fontSize.sp,
                color = androidx.compose.ui.graphics.Color.Black
            ), colors = TextFieldDefaults.textFieldColors(
                containerColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
                focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
            ), readOnly = true
        )
    }
}

@Composable
fun generarFilaHorizontal(
    text: String, onTextChange: (String) -> Unit, btn1: String, btn2: String, btn3: String
) {
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
                onTextChange(text + btn1)

            }) {
            Text(
                text = btn1, fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                onTextChange(text + btn2)

            }) {
            Text(
                text = btn2, fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                onTextChange(text + btn3)

            }) {
            Text(
                text = btn3, fontSize = 18.sp, modifier = Modifier.wrapContentSize()
            )
        }


    }
}

@Composable
fun generarFilasCalculadoraVertical(
    text: String,
    onTextChange: (String) -> Unit,
    btn1: String,
    btn2: String,
    btn3: String,
    btn4: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp, top = 10.dp)
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
                onTextChange(text + btn1)
            }) {
            Text(text = btn1, fontSize = 18.sp, modifier = Modifier.wrapContentSize())
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
                onTextChange(text + btn2)
            }) {
            Text(text = btn2, fontSize = 18.sp, modifier = Modifier.wrapContentSize())
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
                onTextChange(text + btn3)
            }) {
            Text(text = btn3, fontSize = 18.sp, modifier = Modifier.wrapContentSize())
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
            Text(text = btn4, fontSize = 18.sp, modifier = Modifier.wrapContentSize())
        }
    }
}

@Composable
fun generarFilasOperacionesHorizontal(btn1: String, btn2: String) {
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
                text = btn1, fontSize = 18.sp, modifier = Modifier.wrapContentSize()
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
                text = btn2, fontSize = 18.sp, modifier = Modifier.wrapContentSize()
            )
        }


    }
}

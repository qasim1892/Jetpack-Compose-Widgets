package com.aussource.widget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aussource.widget.ui.MyText
import com.aussource.widget.ui.theme.WidgetTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetTheme {
                Surface(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(), color = MaterialTheme.colorScheme.background
                ) {
                        /**
                         * Sequence of calling composable functions does not matter.
                         * All the function execute simultaneously
                         */
                        /**
                         * Sequence of calling composable functions does not matter.
                         * All the function execute simultaneously
                         */

                        //Constraint layout Composable
                        //ConstraintLayoutContent()

                        //My Card Composable
                        MyCard(
                            content = {
                                Column() {
                                    //My Button Composable
                                    MyButton(
                                        text = "Click me", onClick = {
                                            // Your button click action here
                                        }, modifier = Modifier.padding(16.dp)
                                    )
                                    //My Text Composable
                                    MyText(
                                        text = "This is some text",
                                        modifier = Modifier.padding(8.dp)
                                    )

                                    val textFieldValue = remember { mutableStateOf("") }

                                    //My Text Field Composable
                                    MyTextField(
                                        value = textFieldValue.value,
                                        onValueChange = { textFieldValue.value = it },
                                        label = "Enter text",
                                        modifier = Modifier
                                            .padding(16.dp)

                                    )
                                }

                            }, modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .padding(16.dp)
                        )
                }
            }
        }
    }
}


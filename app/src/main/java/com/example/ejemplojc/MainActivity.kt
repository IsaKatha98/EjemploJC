package com.example.ejemplojc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.ejemplojc.ui.theme.EjemploJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row {
        Column ( modifier= Modifier.fillMaxWidth(),
            horizontalAlignment=Alignment.End){

            Text(
                text = "Hello Isa",
                fontSize=48.sp,
                color= Color(223,27,16,47),
                modifier=modifier.padding(8.dp)
            )

        }
    }
        AsyncImage(model ="https://lp2.hm.com/hmgoepprod?set=quality%5B79%5D%2Csource%5B%2F76%2F6c%2F766c02243dfcbceceabf4d0df57508dc3584283c.jpg%5D%2Corigin%5Bdam%5D%2Ccategory%5B%5D%2Ctype%5BLOOKBOOK%5D%2Cres%5Bm%5D%2Chmver%5B1%5D&call=url[file:/product/main]",
            contentDescription ="foto michi",
            Modifier.size(400.dp,400.dp))


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjemploJCTheme {
        Greeting("Android")
    }
}
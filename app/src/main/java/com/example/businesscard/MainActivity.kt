package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

// #243447

@Composable
fun BusinessCard() {
    UpperPart()
    LowerPart()
}

@Composable
fun UpperPart(){
    val image = painterResource(R.drawable.android_logo)
    Column(horizontalAlignment = Alignment.CenterHorizontally
        ,verticalArrangement = Arrangement.Center
    ) {
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(60.dp)
            .width(80.dp)
        )
        Text(text = "Thomas Paravaitsis", fontSize = 30.sp)
        Text(text = "Android App Developer")
    }
}

@Composable
fun LowerPart(){

    Column(verticalArrangement = Arrangement.Bottom
        ,horizontalAlignment = Alignment.CenterHorizontally
        ,modifier = Modifier.fillMaxWidth().padding(0.dp,0.dp,0.dp,40.dp)) {

        Row(modifier= Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.End)
                .weight(1f)
            )
            {
                Icon(Icons.Rounded.ShoppingCart, contentDescription = null)
            }
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.Start)
                .weight(3f).padding(start = 20.dp)
            )
            {
                Text(text = "Test")
            }
        }
        
    }

}


@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}
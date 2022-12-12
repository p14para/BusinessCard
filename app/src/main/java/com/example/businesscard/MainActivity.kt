package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    color = MaterialTheme.colors.surface,
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
        ,verticalArrangement = Arrangement.Center, modifier = Modifier.background(Color(0xFF243447))
    ) {
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(90.dp)
            .width(100.dp)
            .padding(bottom = 8.dp)
        )
        Text(text = "Thomas Paravaitsis", fontSize = 30.sp,color = Color.White, modifier = Modifier
            .padding(bottom = 10.dp))
        Text(text = "Android App Developer"
            , fontWeight = FontWeight.Bold
            , color = Color(61, 220, 132))
    }
}

@Composable
fun LowerPart(){

    Column(verticalArrangement = Arrangement.Bottom
        ,horizontalAlignment = Alignment.CenterHorizontally
        ,modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 0.dp, 0.dp, 40.dp)) {
        Divider(color = Color.White, thickness = 1.dp)
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.End)
                .weight(1f)
            )
            {
                Icon(Icons.Rounded.Call
                    , contentDescription = null
                    , tint = Color(61, 220, 131))
            }
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.Start)
                .weight(3f)
                .padding(start = 30.dp)
            )
            {
                Text(text = "+30 694 098 0056", color = Color.White)
            }
        }

        Divider(color = Color.White, thickness = 1.dp)
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.End)
                .weight(1f)
            )
            {
                Icon(Icons.Rounded.Face
                    , contentDescription = null
                    , tint = Color(61, 220, 131))
            }
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.Start)
                .weight(3f)
                .padding(start = 30.dp)
            )
            {
                Text(text = "Facebook -> Μακης Παραβαιτσης", color = Color.White)
            }
        }

        Divider(color = Color.White, thickness = 1.dp)
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.End)
                .weight(1f)
            )
            {
                Icon(Icons.Rounded.Email
                    , contentDescription = null
                    , tint = Color(61, 220, 131))
            }
            Column(modifier = Modifier
                .wrapContentWidth(align = Alignment.Start)
                .weight(3f)
                .padding(start = 30.dp)
            )
            {
                Text(text = "thomaspara96@gmail.com", color = Color.White)
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
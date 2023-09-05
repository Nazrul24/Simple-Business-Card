package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        image = painterResource(id = R.drawable.android_logo),
                        name = stringResource(id = R.string.name),
                        title = stringResource(id = R.string.title),
                        email = stringResource(id = R.string.email),
                        linkedin = stringResource(id = R.string.linkedin),
                        phone = stringResource(id = R.string.phone)
                   )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    image: Painter,
    name: String,
    title: String,
    email: String,
    linkedin: String,
    phone: String
){

    Column () {
        Row (
            modifier = Modifier
                .padding(24.dp)
                .weight(1f)
        )
        {

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally ,
                verticalArrangement = Arrangement.Center
            ) {

                Image(
                    painter = image,
                    contentDescription = null
                )
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
                Text(
                    text = title,
                    fontSize = 16.sp
                )
            }
        }

        Row (
            modifier = Modifier
                .padding(24.dp)
                .weight(1f)
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                verticalArrangement = Arrangement.Top
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 4.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mail),
                        contentDescription = "Email Logo",
                        modifier = Modifier
                            .size(20.dp)

                    )
                    Text(
                        text = email,
                        modifier = Modifier.padding(start = 8.dp),
                        fontSize = 18.sp
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 4.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.linkedin),
                        contentDescription = "Linkedin Logo",
                        modifier = Modifier
                            .size(20.dp)

                    )
                    Text(
                        text = linkedin,
                        modifier = Modifier.padding(start = 8.dp),
                        fontSize = 18.sp
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 4.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mobile_phone_icon),
                        contentDescription = "Phone Logo",
                        modifier = Modifier
                            .size(20.dp)

                    )
                    Text(
                        text = phone,
                        modifier = Modifier.padding(start = 8.dp),
                        fontSize = 18.sp
                    )
                }
            }


        }
    }




}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            image = painterResource(id = R.drawable.android_logo),
            name = stringResource(id = R.string.name),
            title = stringResource(id = R.string.title),
            email = stringResource(id = R.string.email),
            linkedin = stringResource(id = R.string.linkedin),
            phone = stringResource(id = R.string.phone)

        )
    }
}
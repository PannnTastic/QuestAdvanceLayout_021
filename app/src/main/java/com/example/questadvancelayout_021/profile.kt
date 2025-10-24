package com.example.questadvancelayout_021

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profil(modifier: Modifier){
    Column(modifier = Modifier
        .padding(top = 100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(140.dp),
            shape = CircleShape,
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
        ) {
            val pannn = painterResource(id = R.drawable.pannn)
            Image(
                painter = pannn,
                contentDescription = "Pannn",
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier.size(50.dp)
                    .padding(),
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                val fb = painterResource(id = R.drawable.facebook)
                Image(
                    painter = fb,
                    contentDescription = "Facebook",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Card(
                modifier = Modifier.size(50.dp),
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                val ig = painterResource(id = R.drawable.instagram)
                Image(
                    painter = ig,
                    contentDescription = "Instagram",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Card(
                modifier = Modifier.size(50.dp),
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                val gmail = painterResource(id = R.drawable.gmail)
                Image(
                    painter = gmail,
                    contentDescription = "Gmail",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Card(
                modifier = Modifier.size(50.dp),
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                val linkedin = painterResource(id = R.drawable.linkedin)
                Image(
                    painter = linkedin,
                    contentDescription = "Linkeidn",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Text(
            text = stringResource(id = R.string.name),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp),
            color = Color.Black
        )

        Text(
            text = stringResource(id = R.string.bio),
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 8.dp),
            color = Color.Black,
            fontFamily = FontFamily.Monospace
        )
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )) {
            Row() {
                val shield = painterResource(id = R.drawable.img)
                Image(
                    painter = shield,
                    contentDescription = null,
                    modifier = Modifier
                        .size(90.dp)
                        .padding(all = 10.dp)
                )
                Text(text = stringResource(id = R.string.menu1),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier
                    .width(100.dp))
                val arrow = painterResource(id = R.drawable.img_1)
                Image(
                    painter = arrow,
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(all = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
            }

        }
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )) {
            Row() {
                val shield = painterResource(id = R.drawable.img_2)
                Image(
                    painter = shield,
                    contentDescription = null,
                    modifier = Modifier
                        .size(90.dp)
                        .padding(all = 10.dp)
                )
                Text(text = stringResource(id = R.string.menu2),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier
                    .width(100.dp))
                val arrow = painterResource(id = R.drawable.img_1)
                Image(
                    painter = arrow,
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(all = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
            }

        }
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )) {
            Row() {
                val shield = painterResource(id = R.drawable.img_3)
                Image(
                    painter = shield,
                    contentDescription = null,
                    modifier = Modifier
                        .size(90.dp)
                        .padding(all = 10.dp)
                )
                Text(text = stringResource(id = R.string.menu3),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier
                    .width(100.dp))
                val arrow = painterResource(id = R.drawable.img_1)
                Image(
                    painter = arrow,
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(all = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            modifier = Modifier
                .clip(shape = CircleShape)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.hsl(hue = 0f, saturation = 0.79f, lightness = 0.5f)
            )) {
            Row() {
                val shield = painterResource(id = R.drawable.img_4)
                Image(
                    painter = shield,
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(all = 10.dp)
                )
                Text(text = stringResource(id = R.string.logout),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    color = Color.White,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                        .padding(all = 15.dp)
                )

            }

        }
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Text(
                text = stringResource(id = R.string.copyright),
                fontSize = 12.sp,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}
package com.tc.partyapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {

    val painter = painterResource(id = R.drawable.pineapple)
    val description = "Party"
    val font = FontFamily(
        Font(R.font.quicksand)
    )

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Yellow)
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .clickable {
                        navController.navigate(route = Screen.Party.route)
                    },
                text = "Click HERE To Party",
                fontFamily = font,
                color = MaterialTheme.colors.primary,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            ImageCard(painter = painter, contentDescription = description, modifier = Modifier)
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.padding(horizontal = 30.dp, vertical = 30.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomePreview() {
    HomeScreen(navController = rememberNavController())
}
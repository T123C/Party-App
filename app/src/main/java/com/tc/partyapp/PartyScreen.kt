package com.tc.partyapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun PartyScreen() {
    PartyBox(
        Modifier.fillMaxSize()
    )
}

@Composable
fun PartyBox(modifier: Modifier = Modifier) {
    //remember - keyword to remember the initial state at reload - i.e. yellow color
    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    val font = FontFamily(
        Font(R.font.quicksand)
    )

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(color.value)
            .clickable {
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            }
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = "Tap To Party!!!",
            color = MaterialTheme.colors.primary,
            fontFamily = font,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PartyPreview() {
    PartyScreen()
}
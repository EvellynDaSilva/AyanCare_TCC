package br.senai.sp.jandira.ayancare

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Wave() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(248, 240, 236))

    ){
        Image(
            painter = painterResource(
                id = R.drawable.roda_pe
            ),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            alignment = Alignment.BottomEnd
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WavePreview() {
    Wave()
}
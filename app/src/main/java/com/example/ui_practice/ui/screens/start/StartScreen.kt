package com.example.ui_practice.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.ui.screens.start.components.StartButton
import com.example.ui_practice.ui.theme.Grey500
import com.example.ui_practice.ui.theme.UipracticeTheme
import com.example.ui_practice.ui.theme.playfairDisplay


@Composable
fun StartScreenRoot(
    onClick: () -> Unit,
) {
    StartScreen(
        onClick = onClick
    )
}


@Composable
private fun StartScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .background(Color.Black)
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)

    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .heightIn(max = 600.dp)
                .clip(RoundedCornerShape(100.dp))
                .padding(horizontal = 8.dp)

        )
        Column {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = stringResource(id = R.string.home_headline_1),
                style = MaterialTheme.typography.displaySmall,
                fontFamily = playfairDisplay,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp),

                )
            Text(
                text = stringResource(R.string.home_headline_2),
                style = MaterialTheme.typography.displaySmall,
                fontFamily = playfairDisplay,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.home_tagline),
                style = MaterialTheme.typography.bodyLarge,
                color = Grey500,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            StartButton(onClick = onClick)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    UipracticeTheme {
        StartScreen(onClick = {})
    }
}
package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun NavBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(100.dp))
            .background(Color.Black),
        contentAlignment = Alignment.Center,

        ) {
        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = stringResource(R.string.home),
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = stringResource(R.string.settings),
                tint = Color.White,
                modifier = Modifier.size(20.dp)


            )
            Spacer(modifier = Modifier.width(16.dp))

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = stringResource(R.string.menu),
                tint = Color.White,
                modifier = Modifier.size(20.dp)


            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun NavBarPreview() {
    UipracticeTheme {
        NavBar(

        )
    }
}
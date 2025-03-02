package com.example.ui_practice.ui.screens.transaction_details.components


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ui_practice.ui.theme.White800

@Composable
fun Chip(
    chipContent: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .border(
                1.dp,
                White800,
                RoundedCornerShape(12.dp)
            )
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
            .width(80.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            chipContent()

        }

    }

}
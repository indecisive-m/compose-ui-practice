package com.example.ui_practice.ui.screens.transaction_details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun ChipRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Chip(
            modifier = Modifier.weight(1f),
            chipContent = {
                Icon(
                    imageVector = ArrowsExpandVertical,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(
                    modifier = Modifier.height(8.dp)
                )
                Text(
                    text = stringResource(R.string.split_the_bill),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        Chip(
            modifier = Modifier.weight(1f),

            chipContent = {
                Icon(
                    imageVector = Repeat,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(
                    modifier = Modifier.height(8.dp)
                )
                Text(
                    text = stringResource(R.string.repeat),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        Chip(
            modifier = Modifier.weight(1f),

            chipContent = {
                Icon(
                    imageVector = Icons.Outlined.Star,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(
                    modifier = Modifier.height(8.dp)
                )
                Text(
                    text = stringResource(R.string.save),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TransactionListScreenPreview() {
    UipracticeTheme {
        ChipRow()
    }
}
package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun AccountBalance(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clip(
                RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp
                )
            )
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Text(
            text = "£4,923.82",
            style = MaterialTheme.typography.displaySmall,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
        ) {
            CardChip(
                chipContent = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = stringResource(R.string.top_up),
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White
                    )

                })
            Spacer(modifier = Modifier.width(8.dp))

            CardChip(
                chipContent = {
                    Icon(
                        imageVector = Arrow_outward,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = stringResource(R.string.send_money),
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White
                    )

                })
        }

    }

}


@Preview(showBackground = false)
@Composable
fun AccountBalancePreview() {
    UipracticeTheme {
        AccountBalance()
    }
}
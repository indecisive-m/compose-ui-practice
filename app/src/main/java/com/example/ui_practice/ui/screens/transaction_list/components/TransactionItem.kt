package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.Status
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionType
import com.example.ui_practice.ui.theme.Green400
import com.example.ui_practice.ui.theme.Grey100
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun TransactionItem(
    transactionItem: Transaction,
    modifier: Modifier = Modifier
) {

    val amount = StringBuilder(transactionItem.amount).insertRange(
        1,
        "£",
        0,
        1
    )
        .toString()

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(
                enabled = true,
                onClick = {}
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,

        ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.avatar_2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(32.dp)
                    .clip(RoundedCornerShape(100.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(

            ) {
                Text(
                    text = transactionItem.brand,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = transactionItem.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Grey100

                )
            }
        }
        Text(
            text = amount,
            style = MaterialTheme.typography.bodyLarge,
            color = if (amount.startsWith("+")) Green400 else Color.Black
        )
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionItemPreview() {
    UipracticeTheme {
        TransactionItem(
            transactionItem = transaction,
        )
    }
}

val transaction = Transaction(
    amount = "-38.75",
    brand = "Costa Coffee",
    description = "Coffee Purchase",
    location = "Manchester, England",
    transactionNumber = "TXN-20240201-002",
    status = Status.SUCCESS,
    transactionType = TransactionType.CARD,
    cardNumber = "4876-XXXX-XXXX-9012"
)
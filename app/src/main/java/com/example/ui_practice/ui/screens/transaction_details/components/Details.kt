package com.example.ui_practice.ui.screens.transaction_details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.Status
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionType
import com.example.ui_practice.ui.screens.transaction_list.components.Transaction
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun Details(
    transaction: Transaction,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()

    ) {
        Text(
            text = stringResource(R.string.details),
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(16.dp))


        if (transaction.cardNumber != null) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().height(32.dp)

            ) {
                Text(
                    text = stringResource(R.string.details_card),
                    style = MaterialTheme.typography.bodyMedium

                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.mastercard_symbol_transparentbg),
                        contentDescription = null,
                        modifier = Modifier.size(36.dp),
                        contentScale = ContentScale.Fit
                    )
                    Text(
                        text = "•• "
                    )
                    Text(
                        text = transaction.cardNumber.substringAfterLast("-"),
                        style = MaterialTheme.typography.titleSmall
                    )

                }
            }
        } else {
            return
        }
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().height(32.dp)

        ) {
            Text(
                text = stringResource(R.string.details_transaction_type),
                style = MaterialTheme.typography.bodyMedium


            )
            Text(
                text = if (transaction.transactionType == TransactionType.CARD) stringResource(R.string.details_card_payment) else stringResource(R.string.details_cash_payment),
                style = MaterialTheme.typography.titleSmall
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().height(32.dp)

        ) {
            Text(
                text = stringResource(R.string.details_transaction_number),
                style = MaterialTheme.typography.bodyMedium


            )
            Text(
                text = transaction.transactionNumber,
                style = MaterialTheme.typography.titleSmall

            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().height(32.dp)

        ) {
            Text(
                text = stringResource(R.string.details_status),
                style = MaterialTheme.typography.bodyMedium

            )
            Text(
                text = if (transaction.status == Status.SUCCESS) stringResource(R.string.details_status_success) else stringResource(R.string.details_status_failed),
                style = MaterialTheme.typography.titleSmall

            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DetailsPreview() {
    UipracticeTheme {
        Details(transaction = Transaction)
    }
}


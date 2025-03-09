package com.example.ui_practice.ui.screens.transaction_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.ui_practice.R
import com.example.ui_practice.Transaction
import com.example.ui_practice.ui.TransactionViewModel
import com.example.ui_practice.ui.screens.transaction_details.components.ChipRow
import com.example.ui_practice.ui.screens.transaction_details.components.Details
import com.example.ui_practice.ui.screens.transaction_details.components.Map
import com.example.ui_practice.ui.screens.transaction_details.components.Title
import com.example.ui_practice.ui.screens.transaction_list.components.transaction
import com.example.ui_practice.ui.theme.Grey100
import com.example.ui_practice.ui.theme.UipracticeTheme
import com.example.ui_practice.ui.theme.White800


@Composable
fun TransactionDetailsScreenRoot(
    viewModel: TransactionViewModel
) {

    val state = viewModel.state.collectAsStateWithLifecycle().value

    TransactionDetailsScreen(
        onClick = {},
        transaction = state.selectedTransaction
    )
}


@Composable
private fun TransactionDetailsScreen(
    onClick: () -> Unit,
    transaction: Transaction?,
    modifier: Modifier = Modifier
) {


    if (transaction != null) {

        val amount = StringBuilder(transaction.amount).insertRange(
            1,
            "£",
            0,
            1
        )
            .toString()

        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier.padding(16.dp)
        ) {
            IconButton(
                onClick = onClick,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .clip(RoundedCornerShape(100.dp))
                    .background(White800)
                    .size(32.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = stringResource(R.string.close),
                    modifier = Modifier.size(16.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Title(
                    title = transaction.brand,
                    description = transaction.description
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = amount,
                    style = MaterialTheme.typography.displaySmall,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Date goes here",
                    style = MaterialTheme.typography.bodySmall,
                    color = Grey100
                )
                Spacer(modifier = Modifier.height(24.dp))
                ChipRow()
                Spacer(modifier = Modifier.height(24.dp))

                Details(
                    transactionNumber = transaction.transactionNumber,
                    transactionType = transaction.transactionType,
                    status = transaction.status,
                    cardNumber = transaction.cardNumber,
                )
                Spacer(modifier = Modifier.height(24.dp))
                Map(
                    location = transaction.location
                )

            }

        }
    } else {
        Text(
            text = "Date goes here",
            style = MaterialTheme.typography.bodySmall,
            color = Grey100
        )
    }


}


@Preview(showBackground = true)
@Composable
fun TransactionListScreenPreview() {
    UipracticeTheme {
        TransactionDetailsScreen(
            transaction = transaction,
            onClick = {})
    }
}


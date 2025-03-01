package com.example.ui_practice.ui.screens.transaction_details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.Transaction
import com.example.ui_practice.ui.screens.transaction_details.components.Details
import com.example.ui_practice.ui.screens.transaction_list.components.Transaction
import com.example.ui_practice.ui.theme.UipracticeTheme


@Composable
fun TransactionDetailsScreenRoot(
) {
    TransactionDetailsScreen(transaction = Transaction)
}


@Composable
private fun TransactionDetailsScreen(
    transaction: Transaction,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = transaction.amount
        )
        Details(transaction)
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionListScreenPreview() {
    UipracticeTheme {
        TransactionDetailsScreen(transaction = Transaction)
    }
}


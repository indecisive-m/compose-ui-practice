package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_practice.Status
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionType
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun TransactionList(
    transactionsList: List<Transaction>,
    modifier: Modifier = Modifier
) {
    LazyColumn(

    ) {
        items(transactionsList) { transaction ->
            TransactionItem(transaction)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionListPreview() {
    UipracticeTheme {
        TransactionList(
            transactionList

        )
    }
}

val transactionList = (1..10).map {
    Transaction(
        amount = "-38.75",
        brand = "Costa Coffee",
        description = "Coffee Purchase",
        location = "Manchester, England",
        transactionNumber = "TXN-20240201-002",
        status = Status.SUCCESS,
        transactionType = TransactionType.CARD,
        cardNumber = "4876-XXXX-XXXX-9012"
    )
}
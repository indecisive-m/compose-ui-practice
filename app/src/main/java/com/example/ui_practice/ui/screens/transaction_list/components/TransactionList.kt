package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_practice.Status
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionDay
import com.example.ui_practice.TransactionType
import com.example.ui_practice.ui.theme.UipracticeTheme

@Composable
fun TransactionList(
    transactionsList: List<TransactionDay>,
    modifier: Modifier = Modifier
) {
    LazyColumn(

    ) {
        items(transactionsList) { transaction ->

            TransactionDay(
                transactionDay = transaction,
                transactionItemList = transaction.transactions

            )


        }
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionListPreview() {
    UipracticeTheme {
        TransactionList(
            transactionsList

        )
    }
}


val transactionsList = (1..10).map {
    TransactionDay(
        date = "2024-07-26",
        transactions = listOf(
            Transaction(
                amount = "+38.75",
                brand = "Costa Coffee",
                description = "Coffee Purchase",
                location = "Manchester, England",
                transactionNumber = "TXN-20240201-002",
                status = Status.SUCCESS,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012"
            ),
            Transaction(
                amount = "-38.75",
                brand = "Costa Coffee",
                description = "Coffee Purchase",
                location = "Manchester, England",
                transactionNumber = "TXN-20240201-002",
                status = Status.SUCCESS,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012"
            ),

            )
    )
}
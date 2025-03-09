package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionDay
import com.example.ui_practice.ui.theme.UipracticeTheme
import com.example.ui_practice.ui.transactionsListTest

@Composable
fun TransactionList(
    transactionsList: List<TransactionDay>,
    onTransactionClick: (Transaction) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(

    ) {
        items(
            items = transactionsList,

            ) { transactionDay ->

            TransactionDay(
                transactionDay = transactionDay,
                transactionItemList = transactionDay.transactions,
                onTransactionClick = onTransactionClick

            )


        }
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionListPreview() {
    UipracticeTheme {
        TransactionList(
            transactionsList = transactionsListTest,
            onTransactionClick = {}

        )
    }
}



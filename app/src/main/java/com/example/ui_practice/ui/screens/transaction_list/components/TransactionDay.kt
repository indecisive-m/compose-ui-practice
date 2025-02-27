package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionDay
import kotlinx.datetime.LocalDate

@Composable
fun TransactionDay(
    transactionDay: TransactionDay,
    transactionItemList: List<Transaction>,
    modifier: Modifier = Modifier
) {

    val date: LocalDate = LocalDate.parse(transactionDay.date)

    val formattedDate = "${date.dayOfMonth} ${date.month}".toString()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                top = 16.dp
            )

    ) {
        Text(
            text = formattedDate,
            style = MaterialTheme.typography.labelSmall
        )
        transactionItemList.map { transaction ->
            TransactionItem(transaction)
        }
    }

}

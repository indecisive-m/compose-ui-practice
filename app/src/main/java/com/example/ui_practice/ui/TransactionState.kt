package com.example.ui_practice.ui

import com.example.ui_practice.Status
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionDay
import com.example.ui_practice.TransactionType

data class TransactionState(
    val transactionsList: List<TransactionDay> = transactionsListTest,
    val selectedTransaction: Transaction? = null
)


val transactionsListTest = (1..10).map {
    TransactionDay(
        date = "2024-07-26",
        transactions = listOf(
            Transaction(
                amount = "+38.75",
                brand = "Costa Coffee",
                description = "Coffee Purchase",
                location = "Manchester, England",
                transactionNumber = "TXN-20240201-001",
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
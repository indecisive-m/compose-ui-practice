package com.example.ui_practice


enum class TransactionType {
    CARD, CASH
}

enum class Status {
    SUCCESS, FAIL
}

data class Transaction(
    val amount: String,
    val brand: String,
    val description: String,
    val location: String,
    val transactionNumber: String,
    val status: Status,
    val transactionType: TransactionType,
    val cardNumber: String
)

data class TransactionDay(
    val date: String,
    val transactions: List<Transaction>
)


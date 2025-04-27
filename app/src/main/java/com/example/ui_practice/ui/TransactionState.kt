package com.example.ui_practice.ui

import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionDay
import com.example.ui_practice.data.transactionData

data class TransactionState(
    val transactionsList: List<TransactionDay> = transactionData.reversed(),
    val selectedTransaction: Transaction? = null,
    val openBottomSheet: Boolean = false
)

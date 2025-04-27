package com.example.ui_practice.ui

import com.example.ui_practice.Transaction

sealed interface Action {
    data class OnTransactionClick(val transaction: Transaction) : Action
    data class OnSelectedTransactionChange(val transaction: Transaction?) : Action

}
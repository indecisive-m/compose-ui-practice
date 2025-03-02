package com.example.ui_practice.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn

class TransactionViewModel : ViewModel() {

    private val _state = MutableStateFlow(TransactionState())

    val state = _state.onStart { }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000L),
            _state.value
        )

    fun onAction(action: Action) {
        when (action) {
            is Action.OnTransactionClick -> {

            }
        }
    }
}
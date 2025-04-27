package com.example.ui_practice.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TransactionViewModel : ViewModel() {

    private val _state = MutableStateFlow(TransactionState())

    val state: StateFlow<TransactionState> = _state

    fun onAction(action: Action) {
        when (action) {
            is Action.OnTransactionClick -> {


            }

            is Action.OnSelectedTransactionChange -> {
                _state.update { currentState ->
                    currentState.copy(
                        selectedTransaction = action.transaction,
                        openBottomSheet = true
                    )
                }
            }

        }
    }
}
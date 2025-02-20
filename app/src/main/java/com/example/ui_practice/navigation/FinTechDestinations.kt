package com.example.ui_practice.navigation



enum class Screen{
    HOME,
    TRANSACTIONS_LIST,
    TRANSACTION_DETAILS

}

sealed class FinTechNavigationItem(val route: String) {
    object Home: FinTechNavigationItem(Screen.HOME.name)
    object TransactionsList: FinTechNavigationItem(Screen.TRANSACTIONS_LIST.name)
    object TransactionDetails: FinTechNavigationItem(Screen.TRANSACTION_DETAILS.name)
}
package com.example.ui_practice.navigation

import kotlinx.serialization.Serializable


sealed interface Route {

    @Serializable
    data object TransactionGraph : Route

    @Serializable
    data object Start : Route

    @Serializable
    data object TransactionsList : Route

    @Serializable
    data class TransactionDetails(val id: String) : Route
}
package com.example.ui_practice.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun TransactionListScreenRoot(){
    TransactionListScreen()
}

@Composable
private fun TransactionListScreen(modifier: Modifier = Modifier) {
    Text("List Screen")

}
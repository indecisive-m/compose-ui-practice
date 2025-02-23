package com.example.ui_practice.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



@Composable
fun TransactionDetailsScreenRoot(
) {
    TransactionDetailsScreen()
}


@Composable
private fun TransactionDetailsScreen(modifier: Modifier = Modifier) {
    Text("Transaction Details")

}
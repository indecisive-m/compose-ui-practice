package com.example.ui_practice.ui.screens.transaction_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_practice.ui.screens.transaction_list.components.AccountBalance
import com.example.ui_practice.ui.screens.transaction_list.components.AvatarBar
import com.example.ui_practice.ui.theme.UipracticeTheme


@Composable
fun TransactionListScreenRoot() {
    TransactionListScreen()
}

@Composable
private fun TransactionListScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        AvatarBar()
        AccountBalance()



    }

    }




@Preview(showBackground = true)
@Composable
fun TransactionListScreenPreview() {
    UipracticeTheme {
        TransactionListScreen()
    }
}
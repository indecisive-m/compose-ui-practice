package com.example.ui_practice.ui.screens.transaction_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.ui_practice.R
import com.example.ui_practice.Transaction
import com.example.ui_practice.ui.Action
import com.example.ui_practice.ui.TransactionState
import com.example.ui_practice.ui.TransactionViewModel
import com.example.ui_practice.ui.screens.transaction_list.components.AccountBalance
import com.example.ui_practice.ui.screens.transaction_list.components.AvatarBar
import com.example.ui_practice.ui.screens.transaction_list.components.Filter_list
import com.example.ui_practice.ui.screens.transaction_list.components.NavBar
import com.example.ui_practice.ui.screens.transaction_list.components.TransactionList
import com.example.ui_practice.ui.screens.transaction_list.components.transactionsList
import com.example.ui_practice.ui.theme.Grey500
import com.example.ui_practice.ui.theme.UipracticeTheme


@Composable
fun TransactionListScreenRoot(
    viewModel: TransactionViewModel,
    onTransactionItemClick: (Transaction) -> Unit,
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    TransactionListScreen(
        state = state,
        onAction = { action ->
            when (action) {
                is Action.OnTransactionClick -> onTransactionItemClick(action.transaction)
                else -> Unit
            }
        }
    )
}

@Composable
private fun TransactionListScreen(
    state: TransactionState,
    onAction: (Action) -> Unit,

    modifier: Modifier = Modifier
        .fillMaxSize()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Grey500)
            .statusBarsPadding(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()

        ) {
            AvatarBar()
            Spacer(modifier = Modifier.height(8.dp))
            AccountBalance()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .clip(
                        RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 16.dp
                        )
                    )
                    .background(Color.White)
                    .padding(
                        horizontal = 16.dp,
                        vertical = 24.dp
                    )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = stringResource(R.string.transactions),
                        style = MaterialTheme.typography.titleLarge,
                    )
                    Icon(
                        imageVector = Filter_list,
                        contentDescription = stringResource(R.string.filter_transactions)
                    )


                }

                TransactionList(
                    transactionsList,
                )


            }
        }



        NavBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(32.dp)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionListScreenPreview() {
    UipracticeTheme {
        TransactionListScreen(
            onAction = {},
            state = TODO(),
        )
    }
}
package com.example.ui_practice.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.ui_practice.ui.Action
import com.example.ui_practice.ui.TransactionViewModel
import com.example.ui_practice.ui.screens.start.StartScreenRoot
import com.example.ui_practice.ui.screens.transaction_details.TransactionDetailsScreenRoot
import com.example.ui_practice.ui.screens.transaction_list.TransactionListScreenRoot


@Composable
fun NavHost(
    modifier: Modifier = Modifier

) {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Route.TransactionGraph,
    ) {

        val viewModel = TransactionViewModel()

        navigation<Route.TransactionGraph>(
            startDestination = Route.Start
        ) {
            composable<Route.Start>() {
                StartScreenRoot(
                    onClick = {
                        navController.navigate(Route.TransactionsList)
                    },
                )
            }
            composable<Route.TransactionsList>() {
                TransactionListScreenRoot(
                    viewModel = viewModel,
                    onTransactionItemClick = { transaction ->

                        viewModel.let {
                            viewModel.onAction(Action.OnSelectedTransactionChange(transaction))

                        }
                        navController.navigate(Route.TransactionDetails(transaction.transactionNumber))
                    }
                )
            }
            composable<Route.TransactionDetails>() {

                val selectedTransaction = viewModel.state.collectAsStateWithLifecycle().value

                LaunchedEffect(selectedTransaction) {
                    viewModel.let {
                        viewModel.onAction(Action.OnSelectedTransactionChange(it.state.value.selectedTransaction))
                    }
                }


                TransactionDetailsScreenRoot(
                    viewModel = viewModel
                )
            }
        }
    }
}

package com.example.ui_practice.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.ui_practice.Transaction
import com.example.ui_practice.ui.TransactionViewModel
import com.example.ui_practice.ui.screens.start.StartScreenRoot
import com.example.ui_practice.ui.screens.transaction_details.TransactionDetailsScreenRoot
import com.example.ui_practice.ui.screens.transaction_list.TransactionListScreenRoot
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavHost(
    modifier: Modifier = Modifier

) {

    val navController = rememberNavController()

    var showModal by remember { mutableStateOf(false) }
    var selectedTransaction by remember { mutableStateOf<Transaction?>(null) }
    val modalBottomSheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val coroutineScope = rememberCoroutineScope()


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
                        selectedTransaction = transaction
                        showModal = true
                    }
                )


                if (showModal && selectedTransaction != null) {

                    LaunchedEffect(selectedTransaction) {
                        modalBottomSheetState.show()
                    }

                    ModalBottomSheet(
                        onDismissRequest = {
                            coroutineScope.launch {
                                modalBottomSheetState.hide()
                                showModal = false
                            }
                        },
                        sheetState = modalBottomSheetState,
                        dragHandle = {},
                    ) {
                        selectedTransaction?.let { transaction ->
                            TransactionDetailsScreenRoot(
                                transaction = transaction,
                                onDismiss = {
                                    coroutineScope.launch {
                                        modalBottomSheetState.hide()
                                        showModal = false
                                    }

                                }
                            )
                        }
                    }
                }
            }
        }
    }
}



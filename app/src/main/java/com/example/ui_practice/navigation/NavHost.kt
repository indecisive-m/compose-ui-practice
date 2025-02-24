package com.example.ui_practice.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.ui_practice.ui.screens.TransactionDetailsScreenRoot
import com.example.ui_practice.ui.screens.start.StartScreenRoot
import com.example.ui_practice.ui.screens.transaction_list.TransactionListScreenRoot


////// Add Kotlinx Serialization And change from routes to serializable routes like in the video


@Composable
fun NavHost(
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Route.TransactionGraph
    ) {
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
                TransactionListScreenRoot()
            }
            composable<Route.TransactionDetails>() {
                TransactionDetailsScreenRoot()
            }
        }
    }
}

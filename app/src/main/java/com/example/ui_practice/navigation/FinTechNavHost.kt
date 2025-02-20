package com.example.ui_practice.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ui_practice.ui.screens.HomeScreen
import com.example.ui_practice.ui.screens.TransactionDetailsScreen
import com.example.ui_practice.ui.screens.TransactionListScreen




////// Add Kotlinx Serialization And change from routes to serializable routes like in the video



@Composable
fun FinTechNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = FinTechNavigationItem.Home.route
    ) {
        composable(FinTechNavigationItem.Home.route) {
            HomeScreen()
        }
        composable(FinTechNavigationItem.TransactionsList.route) {
            TransactionListScreen()
        }
        composable(FinTechNavigationItem.TransactionDetails.route) {
            TransactionDetailsScreen()
        }
    }
}

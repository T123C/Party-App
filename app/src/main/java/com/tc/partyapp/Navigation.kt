package com.tc.partyapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        //first screen to show at app launch
        startDestination = Screen.Home.route
    ) {
        //composables for each screen
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Party.route
        ) {
            PartyScreen()
        }
    }
}

package com.tc.partyapp

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Party : Screen("party_screen")
}

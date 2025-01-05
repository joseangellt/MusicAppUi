package com.example.musicappui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.musicappui.ui.theme.AccountView
import com.example.musicappui.ui.theme.BrowseView
import com.example.musicappui.ui.theme.HomeView
import com.example.musicappui.ui.theme.LibraryView
import com.example.musicappui.ui.theme.SubscriptionView

@Composable
fun Navigation(
    navController: NavController,
    viewModel: MainViewModel,
    pd:PaddingValues
    ){
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screens.BottomScreen.Home.route,
        modifier = Modifier.padding(pd)
    ){
        composable(Screens.DrawerScreen.Account.route){
            AccountView()
        }

        composable(Screens.DrawerScreen.Subscription.route){
            SubscriptionView()
        }

        composable(Screens.BottomScreen.Home.bRoute){
            HomeView()
        }

        composable(Screens.BottomScreen.Browse.bRoute){
            BrowseView()
        }

        composable(Screens.BottomScreen.Library.bRoute){
            LibraryView()
        }

    }
    
}
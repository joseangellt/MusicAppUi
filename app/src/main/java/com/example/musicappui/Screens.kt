package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screens(val title: String, val route : String) {

    sealed class BottomScreen(
        val bTitle: String,val bRoute: String, @DrawableRes val icon: Int
    ):Screens(bTitle,bRoute){
        object Home : BottomScreen("Home", "home", R.drawable.ic_music_player_green)

        object Library :BottomScreen("Library", "library", R.drawable.baseline_video_library_24)

        object Browse : BottomScreen("Browse", "browse", R.drawable.baseline_search_24)
    }


    sealed class DrawerScreen(val dTitle: String,val dRoute: String, @DrawableRes val icon: Int)
        : Screens(dTitle,dRoute){
            object Account: DrawerScreen(
                "Acount",
                "account",
                R.drawable.ic_account
            )
            object Subscription:DrawerScreen(
                "Subscription",
                "suscribe",
                R.drawable.ic_subscribe
            )
            object AddAccount: DrawerScreen(
                "Add Account",
                "add_account",
                R.drawable.baseline_person_add_alt_1_24
            )
        }

}


val screensInBottom = listOf(
    Screens.BottomScreen.Home,
    Screens.BottomScreen.Browse,
    Screens.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screens.DrawerScreen.Account,
    Screens.DrawerScreen.Subscription,
    Screens.DrawerScreen.AddAccount
)
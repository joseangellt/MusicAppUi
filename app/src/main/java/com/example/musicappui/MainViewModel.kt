package com.example.musicappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _currentScreen: MutableState<Screens> = mutableStateOf(Screens.BottomScreen.Home)

    val currentScreen: MutableState<Screens>
        get()= _currentScreen

    fun setCurrentScreen(screen:Screens){
        _currentScreen.value = screen
    }
}
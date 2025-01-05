package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.musicappui.R


@Composable
fun BrowseView(){
    val categories = listOf("Raining", "Motivational", "Blues", "Rock and Roll", "Latin", "Alternative")
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ){
        items(categories){
            cat->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_image_24)
        }
    }
}
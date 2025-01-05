package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp


@Composable
fun SubscriptionView(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.padding(bottom = 16.dp))
        Text(
            text = "Manage Subscription",
            style = MaterialTheme.typography.h5,
            )

        Row(
          modifier = Modifier
              .fillMaxWidth()
              .padding(16.dp),
          horizontalArrangement = Arrangement.SpaceBetween
        ){
          Column {
              Text(text = "Musical")
              Text(text = "Free Tier")
          }
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "See All Plans", modifier = Modifier.padding(8.dp))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "see all plans")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
            Text(text = "Get A Plan")
        }
        Divider()
    }
}
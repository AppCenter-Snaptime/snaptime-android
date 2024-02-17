package co.kr.snaptime.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun SettingScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
    ){
        Appbar(
            title = "Setting",
            navIcon = Icons.Filled.ArrowBack,
            onNavClick = { /*TODO*/ },
            menuIcon = Icons.Filled.Menu
        )
    }
}
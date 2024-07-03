package co.kr.snaptime.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.ui.component.MyUserProfile
import co.kr.snaptime.ui.component.NoNavIconAppbar
import co.kr.snaptime.ui.component.ProfileAlbumTab
import co.kr.snaptime.ui.component.STBottomAppBar
import co.kr.snaptime.ui.theme.MainColor_blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            NoNavIconAppbar(title = "Profile", menuIcon = null)
        },
        bottomBar = {
            STBottomAppBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO */ },
                shape = CircleShape,
                containerColor = MainColor_blue
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
        containerColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .background(Color.White)
        ) {
            MyUserProfile()

            Spacer(modifier = Modifier.height(8.dp))

            ProfileAlbumTab()
        }
    }
}

@Preview
@Composable
fun PreProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        ProfileScreen(navController = rememberNavController())
    }
}
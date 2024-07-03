package co.kr.snaptime.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
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
import co.kr.snaptime.R
import co.kr.snaptime.ui.component.AlbumCardView
import co.kr.snaptime.ui.component.NoNavIconAppbar
import co.kr.snaptime.ui.component.STBottomAppBar
import co.kr.snaptime.ui.Icon.HomeIcon
import co.kr.snaptime.ui.Icon.homeicon.Albumadd
import co.kr.snaptime.ui.Icon.homeicon.Qrcodeicon
import co.kr.snaptime.ui.theme.MainColor_blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            NoNavIconAppbar(
                title = "SnapTime",
                menuIcon = HomeIcon.Albumadd
            )
        },
        bottomBar = {
            STBottomAppBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                containerColor = MainColor_blue
            ) {
                Icon(
                    imageVector = HomeIcon.Qrcodeicon,
                    contentDescription = "QR code scan",
                    tint = Color.White
                )
            }
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(it)
                .padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 4.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(5) {
                AlbumCardView(
                    paintId = R.drawable.ic_launcher_foreground,
                    albumTitle = "최근 항목"
                )
            }
        }
    }
}

@Preview
@Composable
fun PreHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        HomeScreen(
            navController = rememberNavController()
        )
    }
}
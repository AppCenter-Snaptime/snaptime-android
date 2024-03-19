package co.kr.snaptime.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.component.MyUserProfile
import co.kr.snaptime.component.NoNavIconAppbar
import co.kr.snaptime.component.ProfileAlbumTab

@Composable
fun ProfileScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        NoNavIconAppbar(
            title = "Profile",
            menuIcon = null
        )

        MyUserProfile()

        Spacer(modifier = Modifier.height(8.dp))

        ProfileAlbumTab()

        /*// 선택된 tab 항목에 들어갈 내용
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Text tab ${state.value + 1} selected"
        )*/


        /*// snap 추가 작업을 하는 floating action button
        FloatingActionButton(
            onClick = {  },
            shape = CircleShape
        ) {
            Icon(Icons.Filled.Add, "snap add FAB")
        }*/

        // bottom app bar 추가
    }
}

@Preview
@Composable
fun PreProfileScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        ProfileScreen(navController = rememberNavController())
    }
}
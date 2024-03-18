package co.kr.snaptime.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    // 현재 탭의 선택된 인덱스
    val state = remember { mutableStateOf(0) }
    val titles = listOf("앨범 목록", "태그 목록")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        NoNavIconAppbar(
            title = "profile",
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
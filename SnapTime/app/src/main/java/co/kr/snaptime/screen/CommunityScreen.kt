package co.kr.snaptime.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.component.NoNavIconAppbar
import co.kr.snaptime.ui.Icon.CommunitySnap
import co.kr.snaptime.ui.Icon.communitysnap.BellAlertIcon

@Composable
fun CommunityScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        NoNavIconAppbar(
            title = "Community",
            menuIcon = CommunitySnap.BellAlertIcon,
            onMenuClick = { }
        )
    }
}

@Composable
@Preview
fun Test(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
    ) {
        CommunityScreen(navController = rememberNavController())
    }
}

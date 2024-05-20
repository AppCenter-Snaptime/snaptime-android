package co.kr.snaptime.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.vector.ImageVector
import co.kr.snaptime.ui.Icon.BottomAppBar
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveCommunity
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveMain
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveProfile
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveRecommend
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveCommunity
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveMain
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveProfile
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveRecommend
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.theme.AppleSDGothicNeo
import co.kr.snaptime.ui.theme.MainColor_blue

data class TabBarItem(
    val title: String,
    val activeIcon: ImageVector,
    val inactiveIcon: ImageVector
)

@Composable
fun STBottomAppBar() {
    var selectedTabIndex by rememberSaveable {
        mutableStateOf(0)
    }

    val homeTab = TabBarItem(
        "홈",
        BottomAppBar.ActiveMain,
        BottomAppBar.InactiveMain
    )

    val communityTab = TabBarItem(
        "커뮤니티",
        BottomAppBar.ActiveCommunity,
        BottomAppBar.InactiveCommunity
    )

    val recommendTab = TabBarItem(
        "추천",
        BottomAppBar.ActiveRecommend,
        BottomAppBar.InactiveRecommend
    )

    val profileTab = TabBarItem(
        "프로필",
        BottomAppBar.ActiveProfile,
        BottomAppBar.InactiveProfile
    )

    val tabItems = listOf(
        homeTab, communityTab, recommendTab, profileTab
    )

    NavigationBar(
        modifier = Modifier.shadow(20.dp),
        containerColor = Color.White,
        contentColor = Color.White
    ) {
        tabItems.forEachIndexed { index, tabBarItem ->
            NavigationBarItem(
                selected = (selectedTabIndex == index),
                onClick = {
                          selectedTabIndex = index
                },
                icon = {
                    Icon(
                        imageVector = if (selectedTabIndex == index) {
                            tabBarItem.activeIcon
                        } else {
                            tabBarItem.inactiveIcon
                        },
                        contentDescription = tabBarItem.title,
                        tint = if (selectedTabIndex == index) {
                            MainColor_blue
                        } else {
                            Color.Black
                        }
                    )
                },
                label = {
                    Text(
                        text = tabBarItem.title,
                        fontFamily = AppleSDGothicNeo
                    )
                },
                // nav bar 요소 색(선택, 안 선택, indicator)
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MainColor_blue,
                    selectedTextColor = MainColor_blue,
                    unselectedIconColor = Color.Black,
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.White
                )
            )
        }
    }
}

@Preview
@Composable
fun PreSTBottomAppBar() {
    STBottomAppBar()
}
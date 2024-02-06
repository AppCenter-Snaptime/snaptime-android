package co.kr.snaptime

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.screen.AllScreen
import co.kr.snaptime.screen.CommunityScreen
import co.kr.snaptime.screen.HomeScreen
import co.kr.snaptime.screen.LogInScreen
import co.kr.snaptime.screen.ProfileScreen
import co.kr.snaptime.screen.SettingScreen
import co.kr.snaptime.screen.SignUpEmailScreen
import co.kr.snaptime.screen.SignUpPWScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AllScreen.LogInScreen.name
    ) {
        composable(AllScreen.LogInScreen.name) {
            LogInScreen(
                navController = navController
            )
        }

        composable(AllScreen.SignUpEmailScreen.name) {
            SignUpEmailScreen(
                navController = navController
            )
        }

        composable(AllScreen.SignUpPWScreen.name) {
            SignUpPWScreen(
                navController = navController
            )
        }

        composable(AllScreen.HomeScreen.name) {
            HomeScreen(
                navController = navController
            )
        }

        composable(AllScreen.CommunityScreen.name) {
            CommunityScreen(
                navController = navController
            )
        }

        composable(AllScreen.ProfileScreen.name) {
            ProfileScreen(
                navController = navController
            )
        }

        composable(AllScreen.SettingScreen.name) {
            SettingScreen(
                navController = navController
            )
        }
    }
}

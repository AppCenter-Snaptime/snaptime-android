package co.kr.snaptime

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.ui.screen.AllScreen
import co.kr.snaptime.ui.screen.CommunityScreen
import co.kr.snaptime.ui.screen.HomeScreen
import co.kr.snaptime.ui.screen.LogInScreen
import co.kr.snaptime.ui.screen.ProfileScreen
import co.kr.snaptime.ui.screen.SettingScreen
import co.kr.snaptime.ui.screen.SignUpEmailScreen
import co.kr.snaptime.ui.screen.SignUpIDScreen
import co.kr.snaptime.ui.screen.SignUpInfoScreen
import co.kr.snaptime.ui.screen.SignUpPWScreen
import co.kr.snaptime.ui.viewmodel.LogInViewModel

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    val logInViewModel = LogInViewModel()

    NavHost(
        navController = navController,
        startDestination = AllScreen.LogInScreen.name
    ) {
        composable(AllScreen.LogInScreen.name) {
            LogInScreen(
                navController = navController,
                loginViewModel = logInViewModel
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

        composable(AllScreen.SignUpInfoScreen.name) {
            SignUpInfoScreen(
                navController = navController
            )
        }

        composable(AllScreen.SignUpIDScreen.name) {
            SignUpIDScreen(
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

package co.kr.snaptime.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.dataStore
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.data.repository.UserRepository
import co.kr.snaptime.di.NetworkModule
import co.kr.snaptime.navigation.AllScreen
import co.kr.snaptime.ui.screen.CommunityScreen
import co.kr.snaptime.ui.screen.HomeScreen
import co.kr.snaptime.ui.screen.LogInScreen
import co.kr.snaptime.ui.screen.ProfileScreen
import co.kr.snaptime.ui.screen.SettingScreen
import co.kr.snaptime.ui.screen.SignUpEmailScreen
import co.kr.snaptime.ui.screen.SignUpPWScreen
import co.kr.snaptime.ui.viewmodel.UserViewModel

@Composable
fun AppNavHost() {
    val userRepo = UserRepository(dataStore = NetworkModule.provideDataStore(LocalContext.current))
    val navController = rememberNavController()
    val userViewModel = UserViewModel(userRepo)

    NavHost(
        navController = navController,
        startDestination = AllScreen.LogInScreen.name
    ) {
        composable(AllScreen.LogInScreen.name) {
            LogInScreen(
                navController = navController,
                userViewModel = userViewModel
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

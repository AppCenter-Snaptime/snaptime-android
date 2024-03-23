package co.kr.snaptime.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.R
import co.kr.snaptime.component.NoNavIconAppbar
import co.kr.snaptime.ui.Icon.SettingIcon
import co.kr.snaptime.ui.Icon.settingicon.Contactsicon
import co.kr.snaptime.ui.Icon.settingicon.Faqicon
import co.kr.snaptime.ui.Icon.settingicon.Notificationsettingicon
import co.kr.snaptime.ui.Icon.settingicon.Profileediticon
import co.kr.snaptime.ui.Icon.settingicon.Securityicon
import co.kr.snaptime.ui.theme.AppleSDGothicNeo
import co.kr.snaptime.ui.theme.MainColor_blue

@Composable
fun SettingScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        NoNavIconAppbar(
            title = "Profile",
            menuIcon = null
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Profile Image"
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "User Id",
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        Image(
                            imageVector = SettingIcon.Profileediticon,
                            contentDescription = "profile edit"
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = "프로필 편집"
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        Image(
                            imageVector = SettingIcon.Notificationsettingicon,
                            contentDescription = "알림 설정"
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = "알림"
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = "ON",
                                color = MainColor_blue
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        Image(
                            imageVector = SettingIcon.Contactsicon,
                            contentDescription = "Help & Support"
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = "Help & Support"
                        )
                    }

                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        Image(
                            imageVector = SettingIcon.Faqicon,
                            contentDescription = "FAQ"
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = "FAQ"
                        )
                    }

                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        Image(
                            imageVector = SettingIcon.Securityicon,
                            contentDescription = "보안"
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = "보안 정책"
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreSettingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        SettingScreen(
            navController = rememberNavController()
        )
    }
}
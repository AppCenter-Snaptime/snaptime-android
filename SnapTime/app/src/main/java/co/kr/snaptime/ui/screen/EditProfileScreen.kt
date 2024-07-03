package co.kr.snaptime.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.R
import co.kr.snaptime.ui.Icon.EditProfileIcon
import co.kr.snaptime.ui.Icon.editprofileicon.Modifyimgicon
import co.kr.snaptime.ui.theme.AppleSDGothicNeo
import co.kr.snaptime.ui.theme.MainColor_blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProfileScreen(
    navController: NavController
) {
    // 임시 text
    var idText by remember { mutableStateOf("jocelyn") }
    var emailText by remember { mutableStateOf("hong123@naver.com") }
    var pwText by remember { mutableStateOf("gildong123!") }
    val annotatedString = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = MainColor_blue,
                fontWeight = FontWeight.SemiBold,
                fontFamily = AppleSDGothicNeo
            )
        ) {
            append("완료")
        }
    }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "프로필 편집"
                )
            },
            navigationIcon = {
                IconButton(
                    onClick = { navController.popBackStack() }
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "뒤로 가기"
                    )
                }
            },
            actions = {
                ClickableText(
                    text = annotatedString
                ){
                    // onClick
                }
            }
        )

        Spacer(modifier = Modifier.height(22.dp))

        // 프로필 이미지
        Box(
            modifier = Modifier
                .wrapContentSize(),
            contentAlignment = Alignment.Center
        ) {
            // 이미지와 아이콘 겹쳐서 하나로 보이게 하기, clickable 하게
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .clip(CircleShape),
                alpha = 0.3f,
                colorFilter = ColorFilter.tint(Color.Black),

                )

            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    imageVector = EditProfileIcon.Modifyimgicon,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 36.dp, vertical = 0.dp)
        ) {
            // 아이디
            Text(
                text = "아이디",
                color = MainColor_blue
            )

            Spacer(modifier = Modifier.height(8.dp))

            BasicTextField(
                value = idText,
                onValueChange = { idText = it },
                maxLines = 1
            ) { innerTextField ->
                Column {
                    innerTextField()

                    Spacer(modifier = Modifier.height(4.dp))

                    Divider()
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 이메일
            Text(
                text = "이메일",
                color = MainColor_blue
            )

            Spacer(modifier = Modifier.height(8.dp))

            BasicTextField(
                value = emailText,
                onValueChange = { emailText = it },
                maxLines = 1
            ) { innerTextField ->
                Column {
                    innerTextField()

                    Spacer(modifier = Modifier.height(4.dp))

                    Divider()
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 비밀번호
            Text(
                text = "비밀번호",
                color = MainColor_blue
            )

            Spacer(modifier = Modifier.height(8.dp))

            BasicTextField(
                value = pwText,
                onValueChange = { pwText = it },
                maxLines = 1
            ) { innerTextField ->
                Column {
                    innerTextField()

                    Spacer(modifier = Modifier.height(4.dp))

                    Divider()
                }
            }
        }
    }
}

@Preview
@Composable
fun PreEditProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        EditProfileScreen(
            navController = rememberNavController()
        )
    }
}
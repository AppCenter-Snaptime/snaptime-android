package co.kr.snaptime.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.kr.snaptime.R
import co.kr.snaptime.ui.theme.AppleSDGothicNeo

// parameter 추가 예정
@Composable
fun MyUserProfile() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "user profile image"
        )

        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier.wrapContentSize()) {
            Spacer(modifier = Modifier.height(8.dp))

            // 유저 아이디 텍스트, more vert icon
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "user id",
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Normal
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "더 보기"
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 사진 수, 팔로워, 팔로잉 텍스트
            Row {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontFamily = AppleSDGothicNeo,
                                fontWeight = FontWeight.Normal
                            )
                        ) {
                            append("사진 수")
                            append("\n23")
                        }
                    },
                    modifier = Modifier
                        .weight(1f),
                    lineHeight = 32.sp
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontFamily = AppleSDGothicNeo,
                                fontWeight = FontWeight.Normal
                            )
                        ) {
                            append("팔로워")
                            append("\n24")
                        }
                    },
                    modifier = Modifier
                        .weight(1f),
                    lineHeight = 32.sp
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontFamily = AppleSDGothicNeo,
                                fontWeight = FontWeight.Normal
                            )
                        ) {
                            append("팔로잉")
                            append("\n25")
                        }
                    },
                    modifier = Modifier
                        .weight(1f),
                    lineHeight = 32.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreMyUserProfile() {
    MyUserProfile()
}
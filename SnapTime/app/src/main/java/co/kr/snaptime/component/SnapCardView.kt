package co.kr.snaptime.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.kr.snaptime.R
import co.kr.snaptime.ui.theme.AppleSDGothicNeo

@Composable
fun SnapCardView() {
    Card(
        modifier = Modifier
            .wrapContentSize(),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(0.dp)
    ) {
        Column(
            modifier = Modifier.wrapContentSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "snap 날짜",
                fontSize = 16.sp,
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(4.dp, 4.dp, 4.dp, 4.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {

                // 임시 이미지
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "네컷 사진"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    fontSize = 14.sp,
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Bold,
                    text = "친구 태그"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    fontSize = 14.sp,
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Normal,
                    text = "한 줄 일기"
                )

                Spacer(modifier = Modifier.height(8.dp))

                ClickableText(
                    text = AnnotatedString("댓글 보기"),
                    onClick = {},
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        fontFamily = AppleSDGothicNeo,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun PreSnapCard() {
    SnapCardView()
}
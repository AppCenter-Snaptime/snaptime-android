package co.kr.snaptime.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
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
import co.kr.snaptime.ui.Icon.BottomAppBar
import co.kr.snaptime.ui.Icon.CommunitySnap
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveProfile
import co.kr.snaptime.ui.Icon.communitysnap.CommentIcon
import co.kr.snaptime.ui.Icon.communitysnap.LikeIcon
import co.kr.snaptime.ui.Icon.communitysnap.MorevertIcon
import co.kr.snaptime.ui.Icon.communitysnap.ShareIcon
import co.kr.snaptime.ui.theme.AppleSDGothicNeo

@Composable
fun CommuSnapCardView() {
    Card(
        modifier = Modifier
            .wrapContentSize(),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            modifier = Modifier.wrapContentWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                imageVector = BottomAppBar.ActiveProfile,
                contentDescription = "profile image"
            )

            Column() {
                Text(
                    text = "아이디",
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp
                )

                Text(
                    text = "태그",
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }

            // 더보기 이미지 아이콘
            Image(
                imageVector = CommunitySnap.MorevertIcon,
                contentDescription = "더보기"
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier.wrapContentWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(4.dp, 4.dp, 4.dp, 4.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {

                // 임시 이미지(snap image)
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "네컷 사진"
                )

                Spacer(modifier = Modifier.height(8.dp))
                
                Row {
                    // 아이콘 이미지 파일(좋아요, 댓글, 공유하기)
                    Image(
                        imageVector = CommunitySnap.LikeIcon,
                        contentDescription = "좋아요"
                    )

                    Image(
                        imageVector = CommunitySnap.CommentIcon,
                        contentDescription = "댓글 이동"
                    )

                    Image(
                        imageVector = CommunitySnap.ShareIcon,
                        contentDescription = "공유"
                    )
                    
                }

                Text(
                    fontSize = 8.sp,
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Bold,
                    text = "한 줄 일기"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    fontSize = 8.sp,
                    fontFamily = AppleSDGothicNeo,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    text = "날짜"
                )

                Spacer(modifier = Modifier.height(8.dp))

                ClickableText(
                    text = AnnotatedString("댓글 보기"),
                    onClick = {},
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 6.sp
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun PreCommuSnapCard() {
    CommuSnapCardView()
}
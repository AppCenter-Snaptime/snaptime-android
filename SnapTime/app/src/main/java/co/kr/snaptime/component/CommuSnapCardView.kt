package co.kr.snaptime.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import co.kr.snaptime.R
import co.kr.snaptime.ui.Icon.BottomAppBar
import co.kr.snaptime.ui.Icon.CommunitySnap
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveProfile
import co.kr.snaptime.ui.Icon.communitysnap.CommentIcon
import co.kr.snaptime.ui.Icon.communitysnap.LikeIcon
import co.kr.snaptime.ui.Icon.communitysnap.ShareIcon
import co.kr.snaptime.ui.theme.AppleSDGothicNeo

@Composable
fun CommuSnapCardView() {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            modifier = Modifier.padding(21.dp, 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            // 임시 이미지
            // 이미지 사이즈 따라 수정할 수도 있음
            Image(
                modifier = Modifier.size(32.dp),
                imageVector = BottomAppBar.ActiveProfile,
                contentDescription = "profile image"
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
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

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier.wrapContentWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // 임시 이미지(snap image)
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "네컷 사진"
                )

                Spacer(modifier = Modifier.height(8.dp))
                
                Row(
                    modifier = Modifier.padding(21.dp, 0.dp)
                ) {
                    // 아이콘 이미지 파일(좋아요, 댓글, 공유하기)
                    Image(
                        modifier = Modifier
                            .size(24.dp)
                            .clickable { },
                        imageVector = CommunitySnap.LikeIcon,
                        contentDescription = "좋아요"
                    )

                    Image(
                        modifier = Modifier
                            .size(24.dp)
                            .clickable { },
                        imageVector = CommunitySnap.CommentIcon,
                        contentDescription = "댓글 이동"
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Image(
                            modifier = Modifier
                                .size(24.dp)
                                .clickable { },
                            imageVector = CommunitySnap.ShareIcon,
                            contentDescription = "공유"
                        )
                    }
                    
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier.padding(21.dp, 4.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                fontSize = 14.sp,
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.Normal,
                text = "한 줄 일기"
            )

            Spacer(modifier = Modifier.height(17.dp))

            Text(
                fontSize = 12.sp,
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                text = "날짜"
            )
        }
    }
}

@Preview
@Composable
fun PreCommuSnapCard() {
    CommuSnapCardView()
}
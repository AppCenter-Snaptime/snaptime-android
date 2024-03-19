package co.kr.snaptime.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.kr.snaptime.R
import co.kr.snaptime.ui.theme.AppleSDGothicNeo

@Composable
fun TwoImagesCardView(
    firstPaintId: Int,
    secondPaintId: Int,
    albumTitle: String
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        // 사이즈 조정 필요함
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = firstPaintId),
                contentDescription = "앨범 미리 보기 이미지1"
            )

            Image(
                painter = painterResource(id = secondPaintId),
                contentDescription = "앨범 미리 보기 이미지2"
            )
        }

        Row(
            modifier = Modifier
                .wrapContentSize()
                .padding(16.dp, 8.dp, 0.dp, 8.dp),

            ) {
            Text(
                text = albumTitle,
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )
        }
    }
}

@Preview
@Composable
fun PreTwoImageCard() {
    TwoImagesCardView(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        "최근 항목"
    )
}
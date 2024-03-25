package co.kr.snaptime.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.kr.snaptime.R
import co.kr.snaptime.ui.theme.AppleSDGothicNeo

@Composable
fun AlbumCardView(
    paintId: Int,
    albumTitle: String
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Image(
            modifier = Modifier.clip(RectangleShape),
            painter = painterResource(id = paintId),
            contentDescription = "앨범"
        )

        Row(
            modifier = Modifier
                .wrapContentSize()
                .padding(8.dp, 4.dp, 0.dp, 4.dp),

        ) {
            Text(
                text = albumTitle,
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
fun PreAlbumCard() {
    AlbumCardView(
        R.drawable.ic_launcher_foreground,
        "최근 항목"
    )
}
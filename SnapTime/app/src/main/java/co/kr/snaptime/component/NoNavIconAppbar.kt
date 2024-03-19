package co.kr.snaptime.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.kr.snaptime.ui.theme.AppleSDGothicNeo
import co.kr.snaptime.ui.theme.MainColor_blue

// title 폰트 Calistoga로 변경해야 함
// navigation icon 없는 페이지(하단 앱바의 각 메인 페이지) 때문에 따로 제작
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoNavIconAppbar(
    title: String?,
    menuIcon: ImageVector?,
    onMenuClick: () -> Unit = {}
) {
    TopAppBar(
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = title ?: "",
                color = MainColor_blue,
                fontFamily = AppleSDGothicNeo,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp
            )
        },
        actions = {
            if (menuIcon != null) {
                IconButton(
                    modifier = Modifier.size(24.dp),
                    onClick = onMenuClick
                ) {
                    Icon(
                        imageVector = menuIcon,
                        contentDescription = "Menu Icon"
                    )
                }
            } else {
                Spacer(Modifier.size(24.dp))
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.White
        )
    )
}
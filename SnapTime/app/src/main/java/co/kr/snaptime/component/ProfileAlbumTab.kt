package co.kr.snaptime.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.kr.snaptime.R
import co.kr.snaptime.ui.theme.gray

@Composable
fun ProfileAlbumTab() {
    // 현재 탭의 선택된 인덱스
    val state = remember { mutableStateOf(0) }
    val titles = listOf("앨범 목록", "태그 목록")

    Column() {
        TabRow(
            selectedTabIndex = state.value,
            modifier = Modifier.background(Color.White),
            contentColor = Color.Black,
            indicator = { tabPositions ->
                Box(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[state.value])
                        .padding(start = 50.dp, end = 70.dp)
                        .background(color = gray)
                        .height(2.dp)
                )
            },
            containerColor = Color.White
        ) {
            titles.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    modifier = Modifier
                        .padding(end = 20.dp, bottom = 8.dp)
                        .background(Color.White),
                    selected = state.value == index,
                    onClick = { state.value = index }
                )
            }
        }

        if (state.value == 0) {
            // lazyColumn으로 UI 구성해야 함
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp, top = 24.dp, end = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TwoImagesCardView(
                    firstPaintId = R.drawable.ic_launcher_foreground,
                    secondPaintId = R.drawable.ic_launcher_foreground,
                    albumTitle = "최근 항목"
                )

                Spacer(modifier = Modifier.height(20.dp))

                TwoImagesCardView(
                    firstPaintId = R.drawable.ic_launcher_foreground,
                    secondPaintId = R.drawable.ic_launcher_foreground,
                    albumTitle = "2023"
                )
            }
        } else {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                content = {
                    // 태그 목록
                },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Preview
@Composable
fun PreProfileAlbumTab() {
    ProfileAlbumTab()
}
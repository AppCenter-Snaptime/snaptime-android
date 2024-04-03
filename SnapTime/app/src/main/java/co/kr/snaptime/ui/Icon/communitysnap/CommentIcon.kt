package co.kr.snaptime.ui.Icon.communitysnap

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.CommunitySnap

public val CommunitySnap.CommentIcon: ImageVector
    get() {
        if (_commentIcon != null) {
            return _commentIcon!!
        }
        _commentIcon = Builder(name = "CommentIcon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveTo(13.78f, 21.0f, 15.5201f, 20.4722f, 17.0001f, 19.4832f)
                curveTo(18.4802f, 18.4943f, 19.6337f, 17.0887f, 20.3149f, 15.4442f)
                curveTo(20.9961f, 13.7996f, 21.1743f, 11.99f, 20.8271f, 10.2442f)
                curveTo(20.4798f, 8.4984f, 19.6226f, 6.8947f, 18.364f, 5.636f)
                curveTo(17.1053f, 4.3774f, 15.5016f, 3.5202f, 13.7558f, 3.1729f)
                curveTo(12.01f, 2.8257f, 10.2004f, 3.0039f, 8.5559f, 3.6851f)
                curveTo(6.9113f, 4.3663f, 5.5057f, 5.5198f, 4.5168f, 6.9999f)
                curveTo(3.5278f, 8.4799f, 3.0f, 10.22f, 3.0f, 12.0f)
                curveTo(3.0f, 13.488f, 3.36f, 14.891f, 4.0f, 16.127f)
                lineTo(3.0f, 21.0f)
                lineTo(7.873f, 20.0f)
                curveTo(9.109f, 20.64f, 10.513f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _commentIcon!!
    }

private var _commentIcon: ImageVector? = null

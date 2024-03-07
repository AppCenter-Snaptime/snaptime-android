package co.kr.snaptime.ui.Icon.bottomappbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.BottomAppBar

public val BottomAppBar.InactiveCommunity: ImageVector
    get() {
        if (_inactiveCommunity != null) {
            return _inactiveCommunity!!
        }
        _inactiveCommunity = Builder(name = "InactiveCommunity", defaultWidth = 18.0.dp,
                defaultHeight = 18.0.dp, viewportWidth = 18.0f, viewportHeight = 18.0f).apply {
            path(fill = SolidColor(Color(0xFF3C3C3C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 11.0f)
                horizontalLineTo(11.71f)
                lineTo(11.43f, 10.73f)
                curveTo(12.41f, 9.59f, 13.0f, 8.11f, 13.0f, 6.5f)
                curveTo(13.0f, 2.91f, 10.09f, 0.0f, 6.5f, 0.0f)
                curveTo(2.91f, 0.0f, 0.0f, 2.91f, 0.0f, 6.5f)
                curveTo(0.0f, 10.09f, 2.91f, 13.0f, 6.5f, 13.0f)
                curveTo(8.11f, 13.0f, 9.59f, 12.41f, 10.73f, 11.43f)
                lineTo(11.0f, 11.71f)
                verticalLineTo(12.5f)
                lineTo(16.0f, 17.49f)
                lineTo(17.49f, 16.0f)
                lineTo(12.5f, 11.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(4.01f, 11.0f, 2.0f, 8.99f, 2.0f, 6.5f)
                curveTo(2.0f, 4.01f, 4.01f, 2.0f, 6.5f, 2.0f)
                curveTo(8.99f, 2.0f, 11.0f, 4.01f, 11.0f, 6.5f)
                curveTo(11.0f, 8.99f, 8.99f, 11.0f, 6.5f, 11.0f)
                close()
            }
        }
        .build()
        return _inactiveCommunity!!
    }

private var _inactiveCommunity: ImageVector? = null

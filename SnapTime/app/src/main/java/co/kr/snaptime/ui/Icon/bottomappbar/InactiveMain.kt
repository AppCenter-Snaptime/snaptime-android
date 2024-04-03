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

public val BottomAppBar.InactiveMain: ImageVector
    get() {
        if (_inactiveMain != null) {
            return _inactiveMain!!
        }
        _inactiveMain = Builder(name = "InactiveMain", defaultWidth = 20.0.dp, defaultHeight =
                17.0.dp, viewportWidth = 20.0f, viewportHeight = 17.0f).apply {
            path(fill = SolidColor(Color(0xFF3C3C3C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                lineTo(10.0f, 0.0f)
                lineTo(0.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _inactiveMain!!
    }

private var _inactiveMain: ImageVector? = null

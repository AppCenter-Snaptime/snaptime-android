package co.kr.snaptime.ui.Icon.homeicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.HomeIcon

public val HomeIcon.Albumadd: ImageVector
    get() {
        if (_albumadd != null) {
            return _albumadd!!
        }
        _albumadd = Builder(name = "Albumadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF030303)),
                    strokeLineWidth = 2.66667f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 5.0f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _albumadd!!
    }

private var _albumadd: ImageVector? = null

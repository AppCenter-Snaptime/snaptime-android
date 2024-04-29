package co.kr.snaptime.ui.Icon.editprofileicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.EditProfileIcon

public val EditProfileIcon.Modifyimgicon: ImageVector
    get() {
        if (_modifyimgicon != null) {
            return _modifyimgicon!!
        }
        _modifyimgicon = Builder(name = "Modifyimgicon", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 56.0f)
                horizontalLineToRelative(-27.72f)
                lineToRelative(-13.63f, -20.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.65f, 3.56f)
                lineTo(75.71f, 56.0f)
                horizontalLineTo(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                moveToRelative(8.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.66f, -3.56f)
                lineTo(100.28f, 48.0f)
                horizontalLineToRelative(55.43f)
                lineToRelative(13.63f, 20.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                moveToRelative(0.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
            }
        }
        .build()
        return _modifyimgicon!!
    }

private var _modifyimgicon: ImageVector? = null

package co.kr.snaptime.ui.Icon.settingicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.SettingIcon

public val SettingIcon.Notificationsettingicon: ImageVector
    get() {
        if (_notificationsettingicon != null) {
            return _notificationsettingicon!!
        }
        _notificationsettingicon = Builder(name = "Notificationsettingicon", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 17.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(10.0f)
                    curveTo(4.0f, 7.8783f, 4.8429f, 5.8434f, 6.3432f, 4.3432f)
                    curveTo(7.8434f, 2.8428f, 9.8783f, 2.0f, 12.0f, 2.0f)
                    curveTo(14.1217f, 2.0f, 16.1566f, 2.8428f, 17.6569f, 4.3432f)
                    curveTo(19.1571f, 5.8434f, 20.0f, 7.8783f, 20.0f, 10.0f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(18.0f, 17.0f)
                    verticalLineTo(10.0f)
                    curveTo(18.0f, 8.4087f, 17.3679f, 6.8826f, 16.2426f, 5.7574f)
                    curveTo(15.1174f, 4.6321f, 13.5913f, 4.0f, 12.0f, 4.0f)
                    curveTo(10.4087f, 4.0f, 8.8826f, 4.6321f, 7.7574f, 5.7574f)
                    curveTo(6.6321f, 6.8826f, 6.0f, 8.4087f, 6.0f, 10.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(18.0f)
                    close()
                    moveTo(9.0f, 21.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(23.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _notificationsettingicon!!
    }

private var _notificationsettingicon: ImageVector? = null

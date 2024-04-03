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

public val SettingIcon.Contactsicon: ImageVector
    get() {
        if (_contactsicon != null) {
            return _contactsicon!!
        }
        _contactsicon = Builder(name = "Contactsicon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 7.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(17.0f, 12.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(12.0f)
                    close()
                    moveTo(20.0f, 17.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(2.0f, 22.0f)
                    curveTo(2.0f, 19.8783f, 2.8428f, 17.8434f, 4.3432f, 16.3431f)
                    curveTo(5.8434f, 14.8429f, 7.8783f, 14.0f, 10.0f, 14.0f)
                    curveTo(12.1217f, 14.0f, 14.1566f, 14.8429f, 15.6569f, 16.3431f)
                    curveTo(17.1571f, 17.8434f, 18.0f, 19.8783f, 18.0f, 22.0f)
                    horizontalLineTo(16.0f)
                    curveTo(16.0f, 20.4087f, 15.3679f, 18.8826f, 14.2426f, 17.7574f)
                    curveTo(13.1174f, 16.6321f, 11.5913f, 16.0f, 10.0f, 16.0f)
                    curveTo(8.4087f, 16.0f, 6.8826f, 16.6321f, 5.7574f, 17.7574f)
                    curveTo(4.6321f, 18.8826f, 4.0f, 20.4087f, 4.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    close()
                    moveTo(10.0f, 13.0f)
                    curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                    curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                    curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                    curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                    close()
                    moveTo(10.0f, 11.0f)
                    curveTo(12.21f, 11.0f, 14.0f, 9.21f, 14.0f, 7.0f)
                    curveTo(14.0f, 4.79f, 12.21f, 3.0f, 10.0f, 3.0f)
                    curveTo(7.79f, 3.0f, 6.0f, 4.79f, 6.0f, 7.0f)
                    curveTo(6.0f, 9.21f, 7.79f, 11.0f, 10.0f, 11.0f)
                    close()
                }
            }
        }
        .build()
        return _contactsicon!!
    }

private var _contactsicon: ImageVector? = null

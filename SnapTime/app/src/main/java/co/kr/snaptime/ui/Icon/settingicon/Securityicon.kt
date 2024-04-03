package co.kr.snaptime.ui.Icon.settingicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.SettingIcon

public val SettingIcon.Securityicon: ImageVector
    get() {
        if (_securityicon != null) {
            return _securityicon!!
        }
        _securityicon = Builder(name = "Securityicon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 5.4087f, 6.6321f, 3.8826f, 7.7574f, 2.7574f)
                curveTo(8.8826f, 1.6321f, 10.4087f, 1.0f, 12.0f, 1.0f)
                curveTo(13.5913f, 1.0f, 15.1174f, 1.6321f, 16.2426f, 2.7574f)
                curveTo(17.3679f, 3.8826f, 18.0f, 5.4087f, 18.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.2652f, 8.0f, 20.5196f, 8.1054f, 20.7071f, 8.2929f)
                curveTo(20.8946f, 8.4804f, 21.0f, 8.7348f, 21.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.2652f, 20.8946f, 21.5196f, 20.7071f, 21.7071f)
                curveTo(20.5196f, 21.8946f, 20.2652f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 22.0f, 3.4804f, 21.8946f, 3.2929f, 21.7071f)
                curveTo(3.1054f, 21.5196f, 3.0f, 21.2652f, 3.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 8.7348f, 3.1054f, 8.4804f, 3.2929f, 8.2929f)
                curveTo(3.4804f, 8.1054f, 3.7348f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(11.0f, 15.732f)
                curveTo(10.6187f, 15.5119f, 10.3207f, 15.1721f, 10.1522f, 14.7653f)
                curveTo(9.9838f, 14.3586f, 9.9542f, 13.9076f, 10.0681f, 13.4823f)
                curveTo(10.1821f, 13.057f, 10.4332f, 12.6813f, 10.7825f, 12.4132f)
                curveTo(11.1318f, 12.1452f, 11.5597f, 11.9999f, 12.0f, 11.9999f)
                curveTo(12.4403f, 11.9999f, 12.8682f, 12.1452f, 13.2175f, 12.4132f)
                curveTo(13.5668f, 12.6813f, 13.8179f, 13.057f, 13.9319f, 13.4823f)
                curveTo(14.0458f, 13.9076f, 14.0162f, 14.3586f, 13.8478f, 14.7653f)
                curveTo(13.6793f, 15.1721f, 13.3813f, 15.5119f, 13.0f, 15.732f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.732f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 5.9391f, 15.5786f, 4.9217f, 14.8284f, 4.1716f)
                curveTo(14.0783f, 3.4214f, 13.0609f, 3.0f, 12.0f, 3.0f)
                curveTo(10.9391f, 3.0f, 9.9217f, 3.4214f, 9.1716f, 4.1716f)
                curveTo(8.4214f, 4.9217f, 8.0f, 5.9391f, 8.0f, 7.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _securityicon!!
    }

private var _securityicon: ImageVector? = null

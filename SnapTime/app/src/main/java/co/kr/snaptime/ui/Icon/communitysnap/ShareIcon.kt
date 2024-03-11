package co.kr.snaptime.ui.Icon.communitysnap

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.CommunitySnap

public val CommunitySnap.ShareIcon: ImageVector
    get() {
        if (_shareIcon != null) {
            return _shareIcon!!
        }
        _shareIcon = Builder(name = "ShareIcon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.293f, 2.2928f)
                curveTo(11.4805f, 2.1053f, 11.7348f, 2.0f, 12.0f, 2.0f)
                curveTo(12.2652f, 2.0f, 12.5195f, 2.1053f, 12.707f, 2.2928f)
                lineTo(15.707f, 5.2928f)
                curveTo(15.8892f, 5.4814f, 15.99f, 5.734f, 15.9877f, 5.9962f)
                curveTo(15.9854f, 6.2584f, 15.8802f, 6.5092f, 15.6948f, 6.6946f)
                curveTo(15.5094f, 6.88f, 15.2586f, 6.9852f, 14.9964f, 6.9875f)
                curveTo(14.7342f, 6.9897f, 14.4816f, 6.8889f, 14.293f, 6.7068f)
                lineTo(13.0f, 5.4138f)
                verticalLineTo(14.9998f)
                curveTo(13.0f, 15.265f, 12.8946f, 15.5194f, 12.7071f, 15.7069f)
                curveTo(12.5196f, 15.8944f, 12.2652f, 15.9998f, 12.0f, 15.9998f)
                curveTo(11.7348f, 15.9998f, 11.4804f, 15.8944f, 11.2929f, 15.7069f)
                curveTo(11.1054f, 15.5194f, 11.0f, 15.265f, 11.0f, 14.9998f)
                verticalLineTo(5.4138f)
                lineTo(9.707f, 6.7068f)
                curveTo(9.5184f, 6.8889f, 9.2658f, 6.9897f, 9.0036f, 6.9875f)
                curveTo(8.7414f, 6.9852f, 8.4906f, 6.88f, 8.3052f, 6.6946f)
                curveTo(8.1198f, 6.5092f, 8.0146f, 6.2584f, 8.0123f, 5.9962f)
                curveTo(8.01f, 5.734f, 8.1108f, 5.4814f, 8.293f, 5.2928f)
                lineTo(11.293f, 2.2928f)
                close()
                moveTo(4.0f, 10.9998f)
                curveTo(4.0f, 10.4694f, 4.2107f, 9.9607f, 4.5858f, 9.5856f)
                curveTo(4.9609f, 9.2105f, 5.4696f, 8.9998f, 6.0f, 8.9998f)
                horizontalLineTo(8.0f)
                curveTo(8.2652f, 8.9998f, 8.5196f, 9.1051f, 8.7071f, 9.2927f)
                curveTo(8.8946f, 9.4802f, 9.0f, 9.7346f, 9.0f, 9.9998f)
                curveTo(9.0f, 10.265f, 8.8946f, 10.5194f, 8.7071f, 10.7069f)
                curveTo(8.5196f, 10.8944f, 8.2652f, 10.9998f, 8.0f, 10.9998f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.9998f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.9998f)
                horizontalLineTo(16.0f)
                curveTo(15.7348f, 10.9998f, 15.4804f, 10.8944f, 15.2929f, 10.7069f)
                curveTo(15.1054f, 10.5194f, 15.0f, 10.265f, 15.0f, 9.9998f)
                curveTo(15.0f, 9.7346f, 15.1054f, 9.4802f, 15.2929f, 9.2927f)
                curveTo(15.4804f, 9.1051f, 15.7348f, 8.9998f, 16.0f, 8.9998f)
                horizontalLineTo(18.0f)
                curveTo(18.5304f, 8.9998f, 19.0391f, 9.2105f, 19.4142f, 9.5856f)
                curveTo(19.7893f, 9.9607f, 20.0f, 10.4694f, 20.0f, 10.9998f)
                verticalLineTo(19.9998f)
                curveTo(20.0f, 20.5302f, 19.7893f, 21.0389f, 19.4142f, 21.414f)
                curveTo(19.0391f, 21.7891f, 18.5304f, 21.9998f, 18.0f, 21.9998f)
                horizontalLineTo(6.0f)
                curveTo(5.4696f, 21.9998f, 4.9609f, 21.7891f, 4.5858f, 21.414f)
                curveTo(4.2107f, 21.0389f, 4.0f, 20.5302f, 4.0f, 19.9998f)
                verticalLineTo(10.9998f)
                close()
            }
        }
        .build()
        return _shareIcon!!
    }

private var _shareIcon: ImageVector? = null

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

public val CommunitySnap.BellAlertIcon: ImageVector
    get() {
        if (_bellAlertIcon != null) {
            return _bellAlertIcon!!
        }
        _bellAlertIcon = Builder(name = "BellAlertIcon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.856f, 16.4983f)
                curveTo(16.7192f, 16.2852f, 18.5499f, 15.8605f, 20.31f, 15.233f)
                curveTo(18.8194f, 13.6383f, 17.9958f, 11.5653f, 17.999f, 9.4168f)
                verticalLineTo(8.6924f)
                curveTo(17.999f, 7.1555f, 17.3669f, 5.6815f, 16.2417f, 4.5948f)
                curveTo(15.1165f, 3.508f, 13.5903f, 2.8975f, 11.999f, 2.8975f)
                curveTo(10.4077f, 2.8975f, 8.8816f, 3.508f, 7.7564f, 4.5948f)
                curveTo(6.6312f, 5.6815f, 5.9991f, 7.1555f, 5.9991f, 8.6924f)
                verticalLineTo(9.4168f)
                curveTo(6.0021f, 11.5654f, 5.178f, 13.6384f, 3.6871f, 15.233f)
                curveTo(5.4201f, 15.8512f, 7.247f, 16.281f, 9.142f, 16.4983f)
                moveTo(14.856f, 16.4983f)
                curveTo(12.958f, 16.7157f, 11.0401f, 16.7157f, 9.142f, 16.4983f)
                moveTo(14.856f, 16.4983f)
                curveTo(15.0001f, 16.9328f, 15.036f, 17.394f, 14.9606f, 17.8444f)
                curveTo(14.8853f, 18.2948f, 14.7009f, 18.7216f, 14.4224f, 19.0901f)
                curveTo(14.144f, 19.4587f, 13.7794f, 19.7585f, 13.3582f, 19.9652f)
                curveTo(12.9371f, 20.1719f, 12.4714f, 20.2797f, 11.999f, 20.2797f)
                curveTo(11.5267f, 20.2797f, 11.061f, 20.1719f, 10.6399f, 19.9652f)
                curveTo(10.2187f, 19.7585f, 9.8541f, 19.4587f, 9.5757f, 19.0901f)
                curveTo(9.2972f, 18.7216f, 9.1128f, 18.2948f, 9.0375f, 17.8444f)
                curveTo(8.9621f, 17.394f, 8.9979f, 16.9328f, 9.142f, 16.4983f)
                moveTo(3.123f, 7.2437f)
                curveTo(3.405f, 5.6259f, 4.1568f, 4.1187f, 5.291f, 2.8975f)
                moveTo(18.707f, 2.8975f)
                curveTo(19.8413f, 4.1187f, 20.5931f, 5.6259f, 20.875f, 7.2437f)
            }
        }
        .build()
        return _bellAlertIcon!!
    }

private var _bellAlertIcon: ImageVector? = null

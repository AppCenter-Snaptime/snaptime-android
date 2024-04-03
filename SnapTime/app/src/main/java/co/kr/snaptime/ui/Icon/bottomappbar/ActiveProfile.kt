package co.kr.snaptime.ui.Icon.bottomappbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import co.kr.snaptime.ui.Icon.BottomAppBar

public val BottomAppBar.ActiveProfile: ImageVector
    get() {
        if (_activeProfile != null) {
            return _activeProfile!!
        }
        _activeProfile = Builder(name = "ActiveProfile", defaultWidth = 22.0.dp, defaultHeight =
                22.0.dp, viewportWidth = 22.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0xFFA4CEFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 8.0f)
                curveTo(15.0f, 9.0609f, 14.5786f, 10.0783f, 13.8284f, 10.8284f)
                curveTo(13.0783f, 11.5786f, 12.0609f, 12.0f, 11.0f, 12.0f)
                curveTo(9.9391f, 12.0f, 8.9217f, 11.5786f, 8.1716f, 10.8284f)
                curveTo(7.4214f, 10.0783f, 7.0f, 9.0609f, 7.0f, 8.0f)
                curveTo(7.0f, 6.9391f, 7.4214f, 5.9217f, 8.1716f, 5.1716f)
                curveTo(8.9217f, 4.4214f, 9.9391f, 4.0f, 11.0f, 4.0f)
                curveTo(12.0609f, 4.0f, 13.0783f, 4.4214f, 13.8284f, 5.1716f)
                curveTo(14.5786f, 5.9217f, 15.0f, 6.9391f, 15.0f, 8.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 8.5304f, 12.7893f, 9.0391f, 12.4142f, 9.4142f)
                curveTo(12.0391f, 9.7893f, 11.5304f, 10.0f, 11.0f, 10.0f)
                curveTo(10.4696f, 10.0f, 9.9609f, 9.7893f, 9.5858f, 9.4142f)
                curveTo(9.2107f, 9.0391f, 9.0f, 8.5304f, 9.0f, 8.0f)
                curveTo(9.0f, 7.4696f, 9.2107f, 6.9609f, 9.5858f, 6.5858f)
                curveTo(9.9609f, 6.2107f, 10.4696f, 6.0f, 11.0f, 6.0f)
                curveTo(11.5304f, 6.0f, 12.0391f, 6.2107f, 12.4142f, 6.5858f)
                curveTo(12.7893f, 6.9609f, 13.0f, 7.4696f, 13.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA4CEFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 0.0f)
                curveTo(4.925f, 0.0f, 0.0f, 4.925f, 0.0f, 11.0f)
                curveTo(0.0f, 17.075f, 4.925f, 22.0f, 11.0f, 22.0f)
                curveTo(17.075f, 22.0f, 22.0f, 17.075f, 22.0f, 11.0f)
                curveTo(22.0f, 4.925f, 17.075f, 0.0f, 11.0f, 0.0f)
                close()
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 13.09f, 2.713f, 15.014f, 3.908f, 16.542f)
                curveTo(4.7472f, 15.4399f, 5.8299f, 14.5467f, 7.0714f, 13.9323f)
                curveTo(8.313f, 13.3179f, 9.6797f, 12.9988f, 11.065f, 13.0f)
                curveTo(12.4323f, 12.9987f, 13.7819f, 13.3095f, 15.0109f, 13.9088f)
                curveTo(16.2399f, 14.508f, 17.316f, 15.3799f, 18.157f, 16.458f)
                curveTo(19.0234f, 15.3216f, 19.6068f, 13.9952f, 19.8589f, 12.5886f)
                curveTo(20.111f, 11.182f, 20.0244f, 9.7355f, 19.6065f, 8.369f)
                curveTo(19.1886f, 7.0024f, 18.4512f, 5.7551f, 17.4555f, 4.73f)
                curveTo(16.4598f, 3.705f, 15.2343f, 2.9319f, 13.8804f, 2.4745f)
                curveTo(12.5265f, 2.0172f, 11.0832f, 1.8888f, 9.6699f, 2.1f)
                curveTo(8.2565f, 2.3112f, 6.9138f, 2.8559f, 5.7528f, 3.689f)
                curveTo(4.5918f, 4.5222f, 3.6458f, 5.6199f, 2.9932f, 6.8912f)
                curveTo(2.3407f, 8.1625f, 2.0002f, 9.571f, 2.0f, 11.0f)
                close()
                moveTo(11.0f, 20.0f)
                curveTo(8.934f, 20.0031f, 6.9303f, 19.2923f, 5.328f, 17.988f)
                curveTo(5.9729f, 17.0647f, 6.8313f, 16.3109f, 7.8302f, 15.7907f)
                curveTo(8.8291f, 15.2705f, 9.9388f, 14.9992f, 11.065f, 15.0f)
                curveTo(12.1772f, 14.9991f, 13.2735f, 15.2636f, 14.2629f, 15.7714f)
                curveTo(15.2524f, 16.2793f, 16.1064f, 17.0159f, 16.754f, 17.92f)
                curveTo(15.1393f, 19.2667f, 13.1026f, 20.0029f, 11.0f, 20.0f)
                close()
            }
        }
        .build()
        return _activeProfile!!
    }

private var _activeProfile: ImageVector? = null

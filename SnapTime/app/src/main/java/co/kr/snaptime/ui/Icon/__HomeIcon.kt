package co.kr.snaptime.ui.Icon

import androidx.compose.ui.graphics.vector.ImageVector
import co.kr.snaptime.ui.Icon.homeicon.Albumadd
import co.kr.snaptime.ui.Icon.homeicon.Qrcodeicon
import kotlin.collections.List as ____KtList

public object HomeIcon

private var __HomeIcon: ____KtList<ImageVector>? = null

public val HomeIcon.HomeIcon: ____KtList<ImageVector>
  get() {
    if (__HomeIcon != null) {
      return __HomeIcon!!
    }
    __HomeIcon= listOf(Qrcodeicon, Albumadd)
    return __HomeIcon!!
  }

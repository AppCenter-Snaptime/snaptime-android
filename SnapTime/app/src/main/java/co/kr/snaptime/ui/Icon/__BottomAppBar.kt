package co.kr.snaptime.ui.Icon

import androidx.compose.ui.graphics.vector.ImageVector
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveCommunity
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveMain
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveProfile
import co.kr.snaptime.ui.Icon.bottomappbar.ActiveRecommend
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveCommunity
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveMain
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveProfile
import co.kr.snaptime.ui.Icon.bottomappbar.InactiveRecommend
import kotlin.collections.List as ____KtList

public object BottomAppBar

private var __BottomAppBar: ____KtList<ImageVector>? = null

public val BottomAppBar.BottomAppBar: ____KtList<ImageVector>
  get() {
    if (__BottomAppBar != null) {
      return __BottomAppBar!!
    }
    __BottomAppBar= listOf(InactiveProfile, ActiveMain, InactiveMain, ActiveProfile,
        InactiveRecommend, ActiveRecommend, ActiveCommunity, InactiveCommunity)
    return __BottomAppBar!!
  }

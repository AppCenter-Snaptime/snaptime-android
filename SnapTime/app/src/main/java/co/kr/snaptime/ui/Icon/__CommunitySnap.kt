package co.kr.snaptime.ui.Icon

import androidx.compose.ui.graphics.vector.ImageVector
import co.kr.snaptime.ui.Icon.communitysnap.BellAlertIcon
import co.kr.snaptime.ui.Icon.communitysnap.CommentIcon
import co.kr.snaptime.ui.Icon.communitysnap.LikeIcon
import co.kr.snaptime.ui.Icon.communitysnap.MorevertIcon
import co.kr.snaptime.ui.Icon.communitysnap.ShareIcon
import kotlin.collections.List as ____KtList

public object CommunitySnap

private var __CommunitySnapIcon: ____KtList<ImageVector>? = null

public val CommunitySnap.CommunitySnapIcon: ____KtList<ImageVector>
  get() {
    if (__CommunitySnapIcon != null) {
      return __CommunitySnapIcon!!
    }
    __CommunitySnapIcon= listOf(MorevertIcon, ShareIcon, LikeIcon, BellAlertIcon, CommentIcon)
    return __CommunitySnapIcon!!
  }

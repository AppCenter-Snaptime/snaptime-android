package co.kr.snaptime.ui.Icon

import androidx.compose.ui.graphics.vector.ImageVector
import co.kr.snaptime.ui.Icon.editprofileicon.Modifyimgicon
import kotlin.collections.List as ____KtList

public object EditProfileIcon

private var __EditProfileIcon: ____KtList<ImageVector>? = null

public val EditProfileIcon.EditProfileIcon: ____KtList<ImageVector>
  get() {
    if (__EditProfileIcon != null) {
      return __EditProfileIcon!!
    }
    __EditProfileIcon= listOf(Modifyimgicon)
    return __EditProfileIcon!!
  }

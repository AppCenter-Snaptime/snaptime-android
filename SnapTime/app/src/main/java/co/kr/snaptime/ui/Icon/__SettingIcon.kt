package co.kr.snaptime.ui.Icon

import androidx.compose.ui.graphics.vector.ImageVector
import co.kr.snaptime.ui.Icon.settingicon.Contactsicon
import co.kr.snaptime.ui.Icon.settingicon.Faqicon
import co.kr.snaptime.ui.Icon.settingicon.Notificationsettingicon
import co.kr.snaptime.ui.Icon.settingicon.Profileediticon
import co.kr.snaptime.ui.Icon.settingicon.Securityicon
import kotlin.collections.List as ____KtList

public object SettingIcon

private var __Setting: ____KtList<ImageVector>? = null

public val SettingIcon.Setting: ____KtList<ImageVector>
  get() {
    if (__Setting != null) {
      return __Setting!!
    }
    __Setting= listOf(Notificationsettingicon, Faqicon, Securityicon, Profileediticon, Contactsicon)
    return __Setting!!
  }

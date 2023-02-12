package com.matrix159.mastadonclone.shared

class AndroidPlatform : Platform {
  override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

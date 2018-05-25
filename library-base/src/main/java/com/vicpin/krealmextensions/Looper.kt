package com.vicpin.krealmextensions

import android.os.HandlerThread
import android.os.Process

val LOOPER_THREAD = HandlerThread(
    REALM_THREAD_NAME,
    Process.THREAD_PRIORITY_BACKGROUND
).apply {
    start()
}

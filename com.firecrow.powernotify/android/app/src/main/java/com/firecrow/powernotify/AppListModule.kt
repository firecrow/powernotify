package com.firecrow.powernotify

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback
import android.util.Log

class AppListModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "AppListModule"
    @ReactMethod fun getApps(callback: Callback) {
        Log.d("fcrow", "getApps called")
        val apps = Fetcher.GetApps()
        callback.invoke(apps)
    }
}
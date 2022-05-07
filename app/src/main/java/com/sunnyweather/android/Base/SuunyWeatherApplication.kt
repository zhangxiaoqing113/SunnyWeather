package com.sunnyweather.android.Base

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.sunnyweather.android.Util


class SuunyWeatherApplication : Application() {
    companion object{
        //@SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
    override fun onCreate() {
        super.onCreate()
        context =applicationContext

    }
}
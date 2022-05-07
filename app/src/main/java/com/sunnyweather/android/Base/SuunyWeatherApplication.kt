package com.sunnyweather.android.Base


import android.app.Application
import android.content.Context



class SuunyWeatherApplication : Application() {
    companion object{
        //@SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "YBU8bZB4w7g9kkn5"

    }
    override fun onCreate() {
        super.onCreate()
        context =applicationContext

    }
}
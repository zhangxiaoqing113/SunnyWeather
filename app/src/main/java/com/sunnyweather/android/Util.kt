package com.sunnyweather.android

import android.widget.Toast
import com.sunnyweather.android.Base.SunnyWeatherApplication

object Util {
    fun String.show(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(SunnyWeatherApplication.context, this, duration)
    }
}
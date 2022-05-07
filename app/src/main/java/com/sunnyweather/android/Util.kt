package com.sunnyweather.android

import android.widget.Toast
import com.sunnyweather.android.Base.SuunyWeatherApplication

object Util {
    fun String.show(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(SuunyWeatherApplication.context, this, duration)
    }
}
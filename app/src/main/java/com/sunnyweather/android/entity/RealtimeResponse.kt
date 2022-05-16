package com.sunnyweather.android.entity

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val status:String,val result:Result) {
    data class Result( val realtime:RealtTime)
    data class RealtTime(val temperature:Float,val skycon:String,@SerializedName("air_quality")val airQuality:AirQuality)
    data class AirQuality(val aqi:AQI)
    data class AQI(val chn:String,val usa:String)
}

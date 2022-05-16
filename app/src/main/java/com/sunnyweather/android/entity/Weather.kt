package com.sunnyweather.android.entity

data class Weather(val realtime:RealtimeResponse.RealtTime,val daily: DailyResponse.Daily) {
}
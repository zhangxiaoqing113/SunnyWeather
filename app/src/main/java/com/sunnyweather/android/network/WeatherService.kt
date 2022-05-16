package com.sunnyweather.android.network

import com.sunnyweather.android.Base.SunnyWeatherApplication
import com.sunnyweather.android.entity.DailyResponse
import com.sunnyweather.android.entity.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    //https://api.caiyunapp.com/v2.6/TAkhjf8d1nlSlspN/101.6656,39.2072/realtime
    @GET("v2.6/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime")
    fun getRealtimeWeather(@Path("lng")lng:String,@Path("lat")lat:String):Call<RealtimeResponse>

    //https://api.caiyunapp.com/v2.6/TAkhjf8d1nlSlspN/101.6656,39.2072/daily?dailysteps=1

    @GET("v2.6/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily?dailysteps=1")
    fun getDailyWeather(@Path("lng")lng:String,@Path("lat")lat:String):Call<DailyResponse>
}
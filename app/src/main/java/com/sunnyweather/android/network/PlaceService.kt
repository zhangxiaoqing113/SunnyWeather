package com.sunnyweather.android.network

import com.sunnyweather.android.Base.SunnyWeatherApplication
import com.sunnyweather.android.entity.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    // https://api.caiyunapp.com/v2/place?query=北京&token=YBU8bZB4w7g9kkn5&lang=zh_CN
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}
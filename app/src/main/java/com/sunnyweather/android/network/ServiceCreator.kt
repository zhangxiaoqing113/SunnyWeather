package com.sunnyweather.android.network

import com.sunnyweather.android.Base.SunnyWeatherApplication
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    var retrofit = Retrofit.Builder()
        .baseUrl(SunnyWeatherApplication.BaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

   // inline fun <reified T> create() = create(T::class.java)

}
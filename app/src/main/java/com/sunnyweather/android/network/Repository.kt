package com.sunnyweather.android.network


import android.util.Log
import androidx.lifecycle.liveData
import com.sunnyweather.android.entity.Place
import com.sunnyweather.android.entity.Weather
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

object Repository {
    private const val TAG = "Repository"
    /*fun searchPlace(query: String) = liveData {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val place = placeResponse.places
                Log.d(TAG, "place: " + place)
                Result.success(place)
            } else {
                Result.failure(RuntimeException("Response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }*/
    fun searchPlace(query: String) = liveData {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val place = placeResponse.places
                Log.d(TAG, "place: " + place)
                Result.success(place)
            } else {
                Result.failure(RuntimeException("Response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }


    fun refreshWeather(lng: String, lat: String) = liveData{
        val result = try {
            coroutineScope {
                val deferredRealtime = async { SunnyWeatherNetwork.getRealtimeWeather(lng, lat) }
                val deferredDaily = async { SunnyWeatherNetwork.getDailyWeather(lng, lat) }
                val realtimeResponse = deferredRealtime.await()
                val dailyResponse = deferredDaily.await()
                if (realtimeResponse.status == "ok" && dailyResponse.status == "ok") {
                    val weather =
                        Weather(realtimeResponse.result.realtime, dailyResponse.result.daily)
                    Result.success(weather)
                } else {
                    Result.failure(
                        java.lang.RuntimeException(
                            "realtimeResponse status is ${realtimeResponse.status}" +
                                    "dailyResponse status is ${dailyResponse.status}"
                        )
                    )
                }

            }
        } catch (e: java.lang.Exception) {
            Result.failure<Weather>(e)
        }
        emit(result)
    }

}
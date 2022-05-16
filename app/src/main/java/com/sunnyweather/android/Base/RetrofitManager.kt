package com.sunnyweather.android.Base

object RetrofitManager {
    //根据名字查询 经纬度
    //https://api.caiyunapp.com/v2/place?query=北京&token=YBU8bZB4w7g9kkn5&lang=zh_CN
    //根据经纬度查询天气
    //https://api.caiyunapp.com/v2.5/YBU8bZB4w7g9kkn5/101.6656,39.2072/realtime
    const val BaseApi="https://api.caiyunapp.com/v2/place?token=YBU8bZB4w7g9kkn5&lang=zh_CN"
    const val TOKEN = "YBU8bZB4w7g9kkn5"

}
package com.sunnyweather.android.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val countReserved: Int) : ViewModel() {
    // https://www.it1352.com/2159626.html
    //关于 get()解释  get()覆盖了isRealtime属性的自动生成的Kotlin getter函数.
    // 因此，它不返回自己的值，而是返回_isRealtime的值.
    /*val isRealtime: LiveData<Boolean>
       get() = _isRealtime
   private val _isRealtime = MutableLiveData<Boolean>()*/
    //我个人建议使用更简单的语法
  /*  private val _isRealtime = MutableLiveData<Boolean>()
    val isRealtime: LiveData<Boolean> = _isRealtime*/


    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int> = _counter
    init {
        _counter.value = countReserved
    }

    fun plusOne() {
        val count = _counter.value ?: 0
        _counter.value = count + 1
    }

    fun clear() {
        _counter.value = 0
    }

}
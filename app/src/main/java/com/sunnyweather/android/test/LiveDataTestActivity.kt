package com.sunnyweather.android.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sunnyweather.android.R
import kotlinx.android.synthetic.main.activity_livedata.*

class LiveDataTestActivity : AppCompatActivity() {

    val viewModel = ViewModelProvider(
        this,
        MainViewModelFactory(100)
    ).get(MainViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)
        bt_plusOne.setOnClickListener {
            viewModel.plusOne()

        }
        bt_clear.setOnClickListener {
            viewModel.clear()
        }
        viewModel.counter.observe(this, Observer { count ->
            tv_text.text = count.toString()
        })

    }
}
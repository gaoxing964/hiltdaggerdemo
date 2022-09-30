package com.mage.hiltdaggerdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsAdapter: AnalyticsAdapter
    @Inject
    lateinit var analyticsService: AnalyticsService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("MainActivityGT", "MainActivityGT $analyticsAdapter")
        Log.i("MainActivityGT", "MainActivityGT $analyticsService")
//        car.
    }
}
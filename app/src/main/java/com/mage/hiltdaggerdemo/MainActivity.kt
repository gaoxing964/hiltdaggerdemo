package com.mage.hiltdaggerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsAdapter: AnalyticsAdapter

    @Inject
    lateinit var analyticsService: AnalyticsService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.forwardButton).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        Log.i("MainActivityGT", "MainActivityGT $analyticsAdapter")
        Log.i("MainActivityGT", "MainActivityGT $analyticsService")
//        car.
    }
}
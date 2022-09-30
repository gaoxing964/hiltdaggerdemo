package com.mage.hiltdaggerdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mage.hiltdaggerdemo.obj.DataBaseObject
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsService: AnalyticsServiceImpl

    @Inject
    lateinit var analyticsService2: AnalyticsServiceImpl

    @Inject
    lateinit var dataBaseObject: DataBaseObject

    @Inject
    lateinit var dataBaseObject2: DataBaseObject


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("MainActivityGT", "MainActivityGT $analyticsService")
        Log.i("MainActivityGT", "MainActivityGT $analyticsService2")
        Log.i("MainActivityGT", "MainActivityGT $dataBaseObject")
        Log.i("MainActivityGT", "MainActivityGT $dataBaseObject2")
//        car.
    }
}
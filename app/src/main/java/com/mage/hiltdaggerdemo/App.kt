package com.mage.hiltdaggerdemo

import android.app.Application
import android.util.Log
import com.mage.hiltdaggerdemo.obj.DataBaseObject
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
@HiltAndroidApp
class App: Application() {

    @Inject
    lateinit var analyticsService: AnalyticsServiceImpl

    @Inject
    lateinit var analyticsService2: AnalyticsServiceImpl

    @Inject
    lateinit var dataBaseObject: DataBaseObject

    @Inject
    lateinit var dataBaseObject2: DataBaseObject

    override fun onCreate() {
        super.onCreate()

        Log.i("ApplicationGT", "MainActivityGT $analyticsService")
        Log.i("ApplicationGT", "MainActivityGT $analyticsService2")
        Log.i("ApplicationGT", "MainActivityGT $dataBaseObject")
        Log.i("ApplicationGT", "MainActivityGT $dataBaseObject2")
    }

}
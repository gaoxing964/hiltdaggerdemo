package com.mage.hiltdaggerdemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
@HiltAndroidApp
class App: Application() {


    override fun onCreate() {
        super.onCreate()
    }
}
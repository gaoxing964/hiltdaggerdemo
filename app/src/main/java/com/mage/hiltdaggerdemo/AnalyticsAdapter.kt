package com.mage.hiltdaggerdemo

import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
class AnalyticsAdapter @Inject constructor(
    private val service: AnalyticsService
)
package com.mage.hiltdaggerdemo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
interface AnalyticsService {
    fun analyticsMethods()
}

// Constructor-injected, because Hilt needs to know how to
// provide instances of AnalyticsServiceImpl, too.
class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {
    override fun analyticsMethods() {

    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule {

    @ActivityScoped
    @Binds
    abstract fun bindAnalyticsService(
        analyticsServiceImpl: AnalyticsServiceImpl
    ): AnalyticsService
}
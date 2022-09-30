package com.mage.hiltdaggerdemo

import com.mage.hiltdaggerdemo.obj.DataBaseObject
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

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
class AnalyticsServiceImpl() : AnalyticsService {
    override fun analyticsMethods() {

    }
}

@Module
@InstallIn(SingletonComponent::class)
class AnalyticsModule {

    @Singleton
    @Provides
    fun provideAnalyticsServiceImpl(): AnalyticsServiceImpl {
        return AnalyticsServiceImpl()
    }

    @Provides
    fun provideDataBaseObject(): DataBaseObject {
        return DataBaseObject()
    }
}
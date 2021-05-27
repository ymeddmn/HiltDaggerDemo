package com.mage.hiltdaggerdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * author  :mayong
 * function:
 * date    :2021/5/28
 **/
@Module
@InstallIn(ActivityComponent::class)
object OkhttpModule {
    @Provides
    fun provideOkhttpClient(
        // Potential dependencies of this type
    ): OkHttpClient {
        return OkHttpClient()
    }

    @Provides
    fun providdeRequest():Request{
        return Request.Builder()
            .get()
            .url("https://developer.android.google.cn/training/dependency-injection/hilt-android")
            .build()
    }
}
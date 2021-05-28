package com.mage.hiltdaggerdemo

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/28
 **/
class BaseInfo @Inject constructor(@ActivityContext private val context: Context) {
    fun printPackageName(){
        println("应用包名 ${context.packageName}")
    }
}
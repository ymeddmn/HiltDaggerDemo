package com.mage.hiltdaggerdemo

import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
class Car @Inject constructor() {
    fun drive(name: String) {
        println("老司机$name 在线开车")
    }
}
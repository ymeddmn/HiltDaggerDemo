package com.mage.hiltdaggerdemo

import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
class Car @Inject constructor(val driver: Driver) {
    //Car的构造函数中增加了Driver司机对象的实现
    fun drive() {
        println("老司机${driver.name} 在线开车")
    }
}
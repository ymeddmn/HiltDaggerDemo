package com.mage.hiltdaggerdemo

import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/27
 **/
class DriverImpl @Inject constructor() : Driver {//因为DriverImpl需要被注入到Car的构造中，所以DriverImpl本身一个是被注入着，他的构造中也需要使用@Inject注解
    override val name: String
        get() = "mage"
}
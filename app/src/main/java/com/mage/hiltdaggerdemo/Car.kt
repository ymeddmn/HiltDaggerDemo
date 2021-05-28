package com.mage.hiltdaggerdemo

import javax.inject.Inject

/**
 * author  :mayong
 * function:
 * date    :2021/5/28
 **/
interface Car {
    fun drive(name:String)
}
class TruckCar @Inject  constructor():Car{
    override fun drive(name: String) {
        println("$name 卡车老司机开车，呜呜")
    }

}
class TaxiCar @Inject  constructor():Car{
    override fun drive(name: String) {
        println("$name 出租车老司机开车，呜呜")
    }

}
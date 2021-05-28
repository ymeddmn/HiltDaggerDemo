package com.mage.hiltdaggerdemo

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

/**
 * author  :mayong
 * function:
 * date    :2021/5/28
 **/
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Truck//卡车类注入标记

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Taxi//出租车类注入标记

@Module
@InstallIn(ActivityComponent::class)
class CarModule {

    @Truck//卡车类生成规则加上这个注解，注入的时候也是用该注解编译器就可以知道我们真实想注入的类型是TruckCar
    @Provides
    fun bindTruckCar(truckCar: TruckCar): Car {
        return TruckCar()
    }

    @Taxi//出租车类生成规则加上这个注解，注入的时候也是用该注解编译器就可以知道我们真实想注入的类型是TaxiCar
    @Provides
    fun bindTaxtCar(taxiCar: TaxiCar): Car {
        return TaxiCar()
    }
}
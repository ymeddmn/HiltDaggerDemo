package com.mage.hiltdaggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Truck//使用卡车注解，真实注入类型为TruckCar
    @Inject
    lateinit var truck: Car

    @Taxi//使用出租车注解，真实注入类型为TruckCar
    @Inject
    lateinit var taxi: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            truck.drive("mage")
            taxi.drive("mage")
        }
    }
}
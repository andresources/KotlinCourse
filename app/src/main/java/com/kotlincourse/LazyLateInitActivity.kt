package com.kotlincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LazyLateInitActivity : AppCompatActivity() {


    //var a: Int not valid statement, ByDefault variables are not nullable types, must initialise the properties while declaration
    //At least we have to assign null value.
    //lateinit var tvDetails: TextView //To overcome this issue, to avoid initialization at the time of declaration.

    //val emp: Employee = Employee() //Object creation
    val emp: Employee by lazy { Employee() } //read- only property
    lateinit var str: String

     lateinit var tvDetails: TextView //late initi ///read-write property

    //Byte,Short,Int,Long,Double,Float,Boolean -> are premitive data
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazy_in)
        tvDetails = findViewById(R.id.tvDetails)

    }

    fun getEmpDetails(view: View) {
        /*str.let {
            println(it?.length)
        }*/
        if(str != null){
            print("Length : ${str?.length}")
        }
        tvDetails.setText(emp.display()) //first emp object create, display
    }
}
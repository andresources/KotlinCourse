package com.kotlincourse.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.kotlincourse.R

class RecyclerViewActivity : AppCompatActivity() {
    val empList: MutableList<Emp> = mutableListOf<Emp>()
    lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        rv = findViewById(R.id.rv)
        loadData()

        rv.adapter = EmployeeAdapter(empList)

    }
    fun loadData(){
        empList.add(Emp("abc",10000))
        empList.add(Emp("xyz",20000))
        empList.add(Emp("pqr",50000))
    }
}
data class Emp(val ename: String, val esal:Int)
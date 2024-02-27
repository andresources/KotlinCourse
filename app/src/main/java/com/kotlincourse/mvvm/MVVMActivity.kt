package com.kotlincourse.mvvm

import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import com.kotlincourse.StudentViewModel
import com.kotlincourse.retrofit.Apis
import com.kotlincourse.retrofit.RetrofitActivity
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MVVMActivity : AppCompatActivity() {
    //Recyler - server data, MVVM Recy + Retr
    lateinit var tvData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvmactivity)
        tvData = findViewById(R.id.tvData)
        val alleriesVM = ViewModelProvider(this).get(GetAllergiesViewModel::class.java)
        //show
        alleriesVM.myAllergies.observe(this,{
            tvData.setText(it.toString())
            //rv.adapter = AllergiesAdapter(allergyList)
            //dismiss

        })
    }
}
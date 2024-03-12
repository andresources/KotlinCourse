package com.kotlincourse.mvvm

import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import com.kotlincourse.StudentViewModel
import com.kotlincourse.hilt.GetDataViewModel
import com.kotlincourse.hilt.Student
import com.kotlincourse.retrofit.Apis
import com.kotlincourse.retrofit.RetrofitActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@AndroidEntryPoint
class MVVMActivity : AppCompatActivity() {
    //Recyler - server data, MVVM Recy + Retr
    lateinit var tvData: TextView
    val alleriesVM: GetAllergiesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvmactivity)
        tvData = findViewById(R.id.tvData)
        //show
        alleriesVM.myAllergies.observe(this,{
            tvData.setText("Response : "+it.toString())
            //rv.adapter = AllergiesAdapter(allergyList)
            //dismiss
        })
    }
}
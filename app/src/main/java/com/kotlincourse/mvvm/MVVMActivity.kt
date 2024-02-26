package com.kotlincourse.mvvm

import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import com.kotlincourse.retrofit.Apis
import com.kotlincourse.retrofit.RetrofitActivity
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MVVMActivity : AppCompatActivity() {
    lateinit var tvData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvmactivity)
        tvData = findViewById(R.id.tvData)
        getAllergies()
    }

    @SuppressLint("SuspiciousIndentation")
    fun getAllergies(){
        var pd = ProgressDialog(this)
        pd.setTitle("Please wait, data is being loaded")
        pd.show()
        var retrofit = RetrofitClient.getSingleton()
        Log.i("zzz","getData - ${retrofit.hashCode()}")

        var apis = retrofit.create(Apis::class.java) //2.Defining endpoint

        lifecycleScope.launch {
            val result = apis.getAllData() //3.calling end point
            tvData.text = result.toString() //Ui update
            pd.dismiss()
        }

    }
}
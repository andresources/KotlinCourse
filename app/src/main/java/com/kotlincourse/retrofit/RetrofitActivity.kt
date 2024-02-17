package com.kotlincourse.retrofit

import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    lateinit var btnGetData: Button
    lateinit var tvData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        btnGetData = findViewById(R.id.btnGetData)
        tvData = findViewById(R.id.tvData)
        btnGetData.setOnClickListener {
            getData()
        }
    }

    @SuppressLint("SuspiciousIndentation")
    fun getData(){
        var pd = ProgressDialog(this)
        pd.setTitle("Please wait, data is being loaded")
        pd.show()
        var retrofit = Retrofit.Builder()
            .baseUrl("http://mytutorings.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var apis = retrofit.create(Apis::class.java)
            lifecycleScope.launch {
                val result = apis.getAllData()
                if (result != null){
                    tvData.text = "Data : ${result.toString()}"
                    pd.dismiss()
                }
            }

    }
}
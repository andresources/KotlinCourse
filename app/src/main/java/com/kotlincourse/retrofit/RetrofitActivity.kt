package com.kotlincourse.retrofit

import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    lateinit var btnGetData: Button
    lateinit var tvData: TextView
    lateinit var etEmail: EditText
    lateinit var etPasword: EditText
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        btnGetData = findViewById(R.id.btnGetData)
        btnLogin = findViewById(R.id.btnLogin)
        tvData = findViewById(R.id.tvData)
        etEmail = findViewById(R.id.etEmail)
        etPasword = findViewById(R.id.etPasword)
        btnLogin.setOnClickListener {
            var email = etEmail.text.toString()
            var pass = etPasword.text.toString()

            var pd = ProgressDialog(this)
            pd.setTitle("Please wait, data is being submitted")
            pd.show()

            var retrofit = Retrofit.Builder()
                .baseUrl("http://mytutorings.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            var apis = retrofit.create(Apis::class.java)
            lifecycleScope.launch {
                var loginRes = apis.loginUser(email,pass)
                pd.dismiss()
                if(loginRes.status =="true"){
                    //startActivity(Dashboard)
                    Toast.makeText(applicationContext,"Successfully",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext,"Invalid username/pwd",Toast.LENGTH_SHORT).show()
                }
            }

        }
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
            .build() //1.endpoint base url setup

        var apis = retrofit.create(Apis::class.java) //2.Defining endpoint

            lifecycleScope.launch {
                val result = apis.getAllData() //3.calling end point
                tvData.text = result.toString() //Ui update
                pd.dismiss()
               /* val result = apis.getAllData()
                if (result != null){
                    tvData.text = "Data : ${result.toString()}"
                    pd.dismiss()
                }*/

            }

    }
}
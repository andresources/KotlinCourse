package com.kotlincourse.retrofit.recyclerview

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.kotlincourse.R
import com.kotlincourse.retrofit.Apis
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AllergiesListActivity : AppCompatActivity() {
    lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allergies_list)
        rv = findViewById(R.id.rv)
    }

    fun getAllergies(view: View) {
        var pd = ProgressDialog(this)
        pd.setTitle("Please wait, data is being loaded")
        pd.show()
//http://mytutorings.in/AffectoscanningProject/getAllergies.php
        //Step 1: Base URL
        var retrofit = Retrofit.Builder()
            .baseUrl("http://mytutorings.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        //Step 2: End point setup
        var apis = retrofit.create(Apis::class.java)

        //Step3 : call end calling
        lifecycleScope.launch {
            val allergyList = apis.getAllergies() //19 records
rv.adapter = AllergiesAdapter(allergyList)
        }
    }
}
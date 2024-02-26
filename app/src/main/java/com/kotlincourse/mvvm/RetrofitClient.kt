package com.kotlincourse.mvvm

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient{
    fun getSingleton() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://mytutorings.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
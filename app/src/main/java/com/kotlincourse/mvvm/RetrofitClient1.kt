package com.kotlincourse.mvvm

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient1 {
    fun getClient() : Retrofit {
        var retrofit = Retrofit.Builder()
            .baseUrl("http://mytutorings.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit;
    }
}
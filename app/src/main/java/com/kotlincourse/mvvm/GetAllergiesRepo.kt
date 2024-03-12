package com.kotlincourse.mvvm

import com.kotlincourse.retrofit.Apis
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
//Repo -> network Layer(Retrofit)
class GetAllergiesRepo @Inject constructor(private val apis1: Apis) {
    /*var apis = Retrofit.Builder()
        .baseUrl("http://mytutorings.in/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(Apis::class.java)

    return apis*/
    suspend fun getAllergies() = apis1.getAllergies()
}
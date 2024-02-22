package com.kotlincourse.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface Apis {
    @GET("AffectoscanningProject/getAllergies.php")
    suspend fun getAllData() : List<MyData>

    //{"message":"Ravi","status":"true"}
    @GET("AffectoscanningProject/login.php")
    suspend fun loginUser(@Query("email") email: String ,@Query("pass") pass: String) : LoginResponse

}


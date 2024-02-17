package com.kotlincourse.retrofit

import retrofit2.http.GET

interface Apis {
    @GET("AffectoscanningProject/getAllergies.php")
    suspend fun getAllData() : List<MyData>
}
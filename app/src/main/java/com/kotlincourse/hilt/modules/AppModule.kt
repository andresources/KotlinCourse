package com.kotlincourse.hilt.modules

import com.kotlincourse.hilt.Student
import com.kotlincourse.hilt.Teacher
import com.kotlincourse.retrofit.Apis
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object appModule {
    @Provides
    @Singleton
    fun provideStudent() = Student()

    @Provides
    @Singleton
    fun provideRetrofit() : Apis{
        var retrofit = Retrofit.Builder()
            .baseUrl("http://mytutorings.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var apis = retrofit.create(Apis::class.java)
        return apis
    }
}

@Module
@InstallIn(ActivityComponent::class)
object appModule1 {
    @Provides
    @ActivityScoped
    fun provideTeacher() = Teacher()
}


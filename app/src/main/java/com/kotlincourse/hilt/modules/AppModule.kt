package com.kotlincourse.hilt.modules

import com.kotlincourse.hilt.Student
import com.kotlincourse.hilt.Teacher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object appModule {
    @Provides
    @Singleton
    fun provideStudent() = Student()

    @Provides
    @Singleton
    fun provideTeacher() = Teacher()
}
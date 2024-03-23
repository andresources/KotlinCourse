package com.aizo.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val username: String,
    val email: String
)






//Database - > collection of tables, -> Data stored in Rows & Columns format(CRUD Oper. )
//Data get -> SQL Quesries

//1. Database
//2. Tables
//3. CURD Oper. using SQLQueries.
//4. Access Database

//User Name , Email
/*
+---------------
Uname | Email

 */
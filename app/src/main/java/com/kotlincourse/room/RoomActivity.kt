package com.kotlincourse.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.room.Room
import com.aizo.room.AppDatabase
import com.aizo.room.User
import com.kotlincourse.R

class RoomActivity : AppCompatActivity() {
    lateinit var tvRecordCount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        tvRecordCount= findViewById(R.id.tvRecordCount)

    }

    fun submitClicked(view: View) {
        val newUser = User(username = "abc", email = "abc@example.com")
        var database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "my_database"
        ).allowMainThreadQueries().build()

        database.userDao().insertUser(newUser)
        Toast.makeText(applicationContext,"Record inserted successfully.",Toast.LENGTH_SHORT).show()

    }

    fun getRecords(view: View) {
        var database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "my_database"
        ).allowMainThreadQueries().build()
        var list:List<User>  = database.userDao().getAllUser()
        tvRecordCount.setText("Records Size : ${list.size}")
    }
}
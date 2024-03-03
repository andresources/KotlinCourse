package com.kotlincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingbarActivity : AppCompatActivity() {
    lateinit var rb: RatingBar
    lateinit var btnGetRating: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ratingbar)
        rb = findViewById(R.id.rb)
        btnGetRating = findViewById(R.id.btnGetRating)
        btnGetRating.setOnClickListener {
            var rating = rb.rating.toString()
            Toast.makeText(this@RatingbarActivity,rating,Toast.LENGTH_SHORT).show()
        }
    }
}
package com.kotlincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlincourse.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTestBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root) //
    }
}
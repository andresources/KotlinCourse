package com.kotlincourse.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class FlowActivity : AppCompatActivity() {
    val flowData: FlowViewModel by viewModels()
    lateinit var tvData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow)
        tvData = findViewById(R.id.tvData)
        lifecycleScope.launch {
            flowData.getData().collect{
                tvData.setText(it)
            }
        }
    }
}
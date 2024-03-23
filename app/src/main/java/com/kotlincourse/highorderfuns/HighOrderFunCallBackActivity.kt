package com.kotlincourse.highorderfuns

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import com.kotlincourse.databing.DataViewModel
import kotlinx.coroutines.launch

class HighOrderFunCallBackActivity : AppCompatActivity() {
    lateinit var tv: TextView
    val viewModel: HighOrderViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_order_fun_call_back)
        tv = findViewById(R.id.tv)
    }
    fun clickMe(view: View?) {
        tv.text = "start computing value..."
        lifecycleScope.launch {
            viewModel.calculateData{
                tv.text = "Result : $it"
            }
        }
    }
}
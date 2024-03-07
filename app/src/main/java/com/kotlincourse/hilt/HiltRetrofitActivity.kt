package com.kotlincourse.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import com.kotlincourse.retrofit.Apis
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HiltRetrofitActivity : AppCompatActivity() {
    @Inject
    lateinit var apis: Apis

    lateinit var tvData: TextView
    val viewModel: GetDataViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_retrofit)
        tvData = findViewById(R.id.tvData)
        viewModel.data.observe(this,{data ->
            data?.let {
                tvData.text = data.toString()
            }
        })
        /*lifecycleScope.launch {
            val result = apis.getAllData() //3.calling end point
            tvData.text = result.toString()
        }*/
    }
}
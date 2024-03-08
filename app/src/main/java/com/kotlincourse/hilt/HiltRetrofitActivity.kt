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
    //MVVM -> Model(Retrofit) , View(Activity/Fragments), ViewModel()
    //Model doen't know about View, View doen't know about Model
    //ViewModel doen't know about View

    //Data Flow
    //Retrofit -> ViewModel(LiveData) <- Activity(UI - View)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_retrofit)
        tvData = findViewById(R.id.tvData)
        viewModel.data.observe(this,{ student ->
            student?.let {//let : Scoped Function -> to check nullability of the object
                tvData.text = student.toString()
            }
        })
        /*lifecycleScope.launch {
            val result = apis.getAllData() //3.calling end point
            tvData.text = result.toString()
        }*/
    }
}
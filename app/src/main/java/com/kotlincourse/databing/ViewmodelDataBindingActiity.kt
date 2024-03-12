package com.kotlincourse.databing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.kotlincourse.R
import com.kotlincourse.databinding.ActivityDatabindingBinding
import com.kotlincourse.databinding.ActivityViewmodelDataBindingActiityBinding
import com.kotlincourse.hilt.GetDataViewModel

class ViewmodelDataBindingActiity : AppCompatActivity() {
    val viewModel: DataViewModel by viewModels()
    lateinit var bindingD: ActivityViewmodelDataBindingActiityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingD = DataBindingUtil.setContentView(this,R.layout.activity_viewmodel_data_binding_actiity)
        bindingD.dataVM = viewModel
        viewModel.setData()
        bindingD.lifecycleOwner = this
    }
}
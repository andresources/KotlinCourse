package com.kotlincourse.mvvm

import android.app.ProgressDialog
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.kotlincourse.retrofit.Allergies
import com.kotlincourse.retrofit.Apis
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GetAllergiesViewModel @Inject constructor(private val respo: GetAllergiesRepo) : ViewModel(){
    var myAllergies = MutableLiveData<List<Allergies>>()
    init {
        getAllergies()
    }
    fun getAllergies(){
       /* var retrofit = RetrofitClient.getSingleton()
        var apis = retrofit.create(Apis::class.java)*/ //2.Defining endpoint
        viewModelScope.launch {
            val result = respo.getAllergies() //3.calling end point
            myAllergies.value = result
        }
    }
}

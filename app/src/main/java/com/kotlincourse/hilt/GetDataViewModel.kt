package com.kotlincourse.hilt

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kotlincourse.retrofit.Apis
import com.kotlincourse.retrofit.MyData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class GetDataViewModel @Inject constructor(private val apis: Apis) : ViewModel(){
    var data: MutableLiveData<List<MyData>> = MutableLiveData()
    init {
        viewModelScope.launch {
            data.value = apis.getAllData()
        }
    }
}
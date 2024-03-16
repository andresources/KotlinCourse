package com.kotlincourse.databing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    var sname: MutableLiveData<String> = MutableLiveData("")
    var sclass: MutableLiveData<String> = MutableLiveData("")
    fun setData(){
        //retrofit logic
        sname.value = "XYZ"
        sclass.value = "V-Class"
    }
}
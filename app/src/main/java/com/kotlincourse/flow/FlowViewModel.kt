package com.kotlincourse.flow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow

class FlowViewModel : ViewModel() {
    fun getData() : Flow<String> =
        flow{
            for(i in 1..10){
                delay(3000)
                emit("$i")
            }
        }

    fun dummy() : Flow<String> =
         flow {
            emit("0")
        }

}
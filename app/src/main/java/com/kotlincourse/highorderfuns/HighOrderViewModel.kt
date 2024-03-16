package com.kotlincourse.highorderfuns

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class HighOrderViewModel : ViewModel() {
    suspend fun calculateData(onComplete: (Int) -> Unit = {}){
        delay(3000L) //for simulation
        //onComplete.invoke(100)
        //Network or any other operations
        var sum = 10 + 20
        onComplete(sum)
    }
}
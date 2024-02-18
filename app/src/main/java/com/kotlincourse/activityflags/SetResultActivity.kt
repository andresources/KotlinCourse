package com.kotlincourse.activityflags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlincourse.R

class SetResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_result)
    }

    fun submitClicked(view: View) {
        val intent = Intent()
        intent.putExtra("ename", "XYZ")
        setResult(100,intent)
        finish()
    }
}
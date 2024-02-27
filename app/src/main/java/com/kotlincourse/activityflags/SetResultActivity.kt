package com.kotlincourse.activityflags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.kotlincourse.R

class SetResultActivity : AppCompatActivity() {
    lateinit var etName: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_result)
        etName =findViewById(R.id.etName)
    }

    fun submitClicked(view: View) {
        val intent = Intent()
        intent.putExtra("ename", etName.text.toString())
        setResult(100,intent)
        finish()
    }
}
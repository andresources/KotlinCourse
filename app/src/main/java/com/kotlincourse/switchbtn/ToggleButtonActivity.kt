package com.kotlincourse.switchbtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat
import com.kotlincourse.R

class ToggleButtonActivity : AppCompatActivity() {
    lateinit var toggleBtn: ToggleButton
    lateinit var btnGetToggleData: Button
    lateinit var switchBtn: SwitchCompat
    lateinit var btnGetSwitchData: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        toggleBtn = findViewById(R.id.toggleBtn)
        btnGetToggleData = findViewById(R.id.btnGetToggleData)
        btnGetToggleData.setOnClickListener {
            Toast.makeText(this@ToggleButtonActivity,"${toggleBtn.text}",Toast.LENGTH_SHORT).show()
        }

        switchBtn = findViewById(R.id.switchBtn)
        btnGetSwitchData = findViewById(R.id.btnGetSwitchData)
        btnGetSwitchData.setOnClickListener {
            Toast.makeText(this@ToggleButtonActivity,"${switchBtn.isChecked}",Toast.LENGTH_SHORT).show()
        }

    }
}
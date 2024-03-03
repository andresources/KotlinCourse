package com.kotlincourse.timepickerdialog

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kotlincourse.R
import java.text.SimpleDateFormat
import java.util.Calendar

class TimePickerActivity : AppCompatActivity() {
    lateinit var btnTimePicker: Button
    lateinit var tvTime: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        btnTimePicker = findViewById(R.id.btnTimePicker)
        tvTime = findViewById(R.id.tvTime)
        btnTimePicker.setOnClickListener {
            val cal = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                tvTime.text = "Hour : $hour, Minute : $minute"
            }
            TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), false)
                .show()
        }
    }
}
package com.kotlincourse.datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kotlincourse.R
import java.util.Calendar

class DatePickerActivity : AppCompatActivity() {
    private lateinit var btnDatePicker: Button
    private lateinit var tvSelectedDate: TextView
    private val calendar = Calendar.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)
        btnDatePicker = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)

        // Set a click listener on the "Select Date" button
        btnDatePicker.setOnClickListener {
            // Show the DatePicker dialog
            showDatePicker()
        }
    }
    private fun showDatePicker() {
        // Create a DatePickerDialog
        val datePickerDialog = DatePickerDialog(
            this, {DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                tvSelectedDate.text = "Selected Date: $dayOfMonth / ${monthOfYear+1} / $year"
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        // Show the DatePicker dialog
        datePickerDialog.show()
    }
}
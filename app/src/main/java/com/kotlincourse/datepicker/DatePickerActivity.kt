package com.kotlincourse.datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
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
        val y= calendar.get(Calendar.YEAR) //2024
        val m = calendar.get(Calendar.MONTH) //03
        val d = calendar.get(Calendar.DAY_OF_MONTH) //04
        //Context context, @Nullable OnDateSetListener listener, int year, int month, int dayOfMonth

        // Create a DatePickerDialog
        val datePickerDialog = DatePickerDialog(
            this,
            { DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                tvSelectedDate.text = "Selected Date: $dayOfMonth / ${monthOfYear+1} / $year"
            },
            y,
            m,
            d
        )
        // Show the DatePicker dialog
        datePickerDialog.show()
    }
}
package com.kotlincourse.telephonymanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kotlincourse.R

class TelephonyManagerActivity : AppCompatActivity() {
    lateinit var btnSMS: Button
    lateinit var btnMail: Button
    lateinit var btnCall: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephony_manager)
        btnSMS = findViewById(R.id.btnSMS)
        btnMail = findViewById(R.id.btnMail)
        btnCall = findViewById(R.id.btnCall)
        btnSMS.setOnClickListener {

        }
    }
}
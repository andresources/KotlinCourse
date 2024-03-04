package com.kotlincourse.telephonymanager

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.kotlincourse.R

class TelephonyManagerActivity : AppCompatActivity() {
    lateinit var btnSMS: Button
    lateinit var btnMail: Button
    lateinit var btnCall: Button
    private val smsRequest = 999
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephony_manager)
        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS,Manifest.permission.CALL_PHONE), smsRequest)

        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), smsRequest)
        btnSMS = findViewById(R.id.btnSMS)
        btnMail = findViewById(R.id.btnMail)
        btnCall = findViewById(R.id.btnCall)
        btnSMS.setOnClickListener {
            var smsMng = SmsManager.getDefault()
            smsMng.sendTextMessage("+918247599246",null,"Hi Test Message",null,null);
        }
        btnMail.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL,"harinathreddy.y1@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT,"This is subject")
            intent.putExtra(Intent.EXTRA_TEXT,"This is body")
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        }
        btnCall.setOnClickListener {
            var intent = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:8247599246"));
            startActivity(intent);

        }
    }
}
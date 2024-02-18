package com.kotlincourse.notifications

import android.Manifest.permission.POST_NOTIFICATIONS
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.kotlincourse.R

class NotificationsActivity : AppCompatActivity() {
    private val CHANNEL_ID = "my_channel_id"
    private val CHANNEL_NAME = "my_channel_name"
    //Step1:NotificationManager
    private lateinit var mNotificationManager: NotificationManager
    //Step2:Notification Channel
    //Step3: Create Pending Intent
    //Step4: Notification.Builder
    //Step5: call notify
    private lateinit var mNotificationBuilder: NotificationCompat.Builder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        runTimePermission()
        setupNotifications()
    }

    fun showNotification(view: View) {
        mNotificationManager.notify(22,mNotificationBuilder.build())
    }

    private fun setupNotifications(){
        //Step1:
        mNotificationManager= getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        //Step2: Notification Channel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val mChannel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME, importance)
            mNotificationManager.createNotificationChannel(mChannel)
        }

        //Step3: Create Pending Intent
        val pendingIntent= PendingIntent.getActivity(this, 420,
            Intent(this, NotificationsActivity::class.java).apply {
                this.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            },
            PendingIntent.FLAG_IMMUTABLE)

        //Step4: Notification.Builder
        mNotificationBuilder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(androidx.vectordrawable.animated.R.drawable.notification_bg_normal_pressed)
            .setContentTitle("My notification")
            .setContentText("Hello World!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            // Set the intent that will fire when the user taps the notification
            .setContentIntent(pendingIntent)
            //.setStyle() -> BigText,BigImage
            .setAutoCancel(true)
    }

    private fun runTimePermission(){
        if (Build.VERSION.SDK_INT >= 33) {
            if(ContextCompat.checkSelfPermission(this, POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED){
                //User granted notifications
            }else { //User not granted notifications
                if (ContextCompat.checkSelfPermission(this, POST_NOTIFICATIONS) == PackageManager.PERMISSION_DENIED) {
                    ActivityCompat.requestPermissions(this, arrayOf(POST_NOTIFICATIONS) , 1);
                }
            }
        }
    }


}
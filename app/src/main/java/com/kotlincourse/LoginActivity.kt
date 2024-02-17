package com.kotlincourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    //1.onCreate(callback method), 2.onStart, 3.onResume, 4.onPause, 5.onStop, 6.onDestroy

    lateinit var tvU: TextView
    lateinit var etUserName: EditText
    lateinit var tvPassword: TextView
    lateinit var etPassword: EditText
    lateinit var tvRegistration: TextView
    lateinit var cb: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvU = findViewById(R.id.tvUsername)
        etUserName = findViewById(R.id.etUserName)
        etPassword = findViewById(R.id.etPassword)
        tvRegistration= findViewById(R.id.tvRegistration)
        cb = findViewById(R.id.cb)
        Log.i("zzz","This is onCreate method")
    }

    override fun onStart() {
        super.onStart()
        Log.i("zzz","This is onStart method")
    }

    override fun onResume() {
        super.onResume()
        Log.i("zzz","This is onResume method")
    }

    override fun onPause() {
        super.onPause()
        Log.i("zzz","This is onPause method")
    }

    override fun onStop() {
        super.onStop()
        Log.i("zzz","This is onStop method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("zzz","This is onDestroy method")
    }




    fun loginFun(view: View) {
        var fg: Boolean = false
        if(cb.isChecked){
            fg = true
        }else{
            fg = false
        }
        var uname = etUserName.getText().toString() //55
        var password = etPassword.text.toString() //assasd
        var intent = Intent(this@LoginActivity,HomeScreenActivity::class.java).apply {
            putExtra("user_name",uname) //user_name = 55
            putExtra("pwd",password) //pwd =assasd
            putExtra("chb",fg)
        }


        startActivity(intent)
    }

    fun funRegistration(view: View) {
        /*var intent = Intent(this@LoginActivity,RegistrationActivity::class.java)
        startActivity(intent)*/

    }
}
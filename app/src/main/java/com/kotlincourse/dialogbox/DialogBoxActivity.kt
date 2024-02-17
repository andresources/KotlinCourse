package com.kotlincourse.dialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.kotlincourse.R

class DialogBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_box)
    }

    fun submitClicked(view: View) {
        display()
    }

    fun display(){
        val obj = AlertDialog.Builder(this)
        obj.setTitle("Messages")
        obj.setMessage("Do you want to delete it?")
        obj.setPositiveButton("Yes"){ d, which ->
            Toast.makeText(this@DialogBoxActivity,"Yes Clicked",Toast.LENGTH_SHORT).show()
            d.dismiss()
        }
        obj.setNegativeButton("No"){ d,w->
            Toast.makeText(this@DialogBoxActivity,"No Clicked",Toast.LENGTH_SHORT).show()
            d.dismiss()
        }
        obj.setNeutralButton("Maybe") { a, b ->
            Toast.makeText(applicationContext, "Maybe clicked", Toast.LENGTH_SHORT).show()
            a.dismiss()
        }

        obj.show()
    }
}
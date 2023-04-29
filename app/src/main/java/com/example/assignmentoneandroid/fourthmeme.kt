package com.example.assignmentoneandroid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourthmeme : AppCompatActivity() {
    lateinit var  buttonit : Button
    lateinit var prevbutton :Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthmeme)
        buttonit =findViewById(R.id.buttonit)
        prevbutton =findViewById(R.id.prevbutton)
        buttonit.setOnClickListener {
            val intent = Intent (this,fifthmeme::class.java)
            startActivity(intent)
        }
        prevbutton.setOnClickListener {
            val intent = Intent (this,codememerd::class.java)
            startActivity(intent)
        }
    }
}
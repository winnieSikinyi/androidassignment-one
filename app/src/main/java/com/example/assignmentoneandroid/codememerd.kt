package com.example.assignmentoneandroid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class codememerd : AppCompatActivity() {
    lateinit var  button2 : Button
    lateinit var bcbutton : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_codememerd)
        button2 =findViewById(R.id. button2)
        bcbutton =findViewById(R.id. bcbutton)
        button2.setOnClickListener {
            val intent = Intent (this,fourthmeme::class.java)
            startActivity(intent)
        }
        bcbutton.setOnClickListener {
            val intent = Intent (this,memeActivity::class.java)
            startActivity(intent)
        }
    }
}
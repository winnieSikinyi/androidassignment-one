package com.example.assignmentoneandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fifthmeme : AppCompatActivity() {
    lateinit var  buttoning : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifthmeme)
        buttoning =findViewById(R.id.buttoning)
        buttoning.setOnClickListener {
            val intent = Intent (this,fourthmeme::class.java)
            startActivity(intent)
        }
    }
}
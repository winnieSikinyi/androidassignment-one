package com.example.assignmentoneandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeActivity : AppCompatActivity() {
    lateinit var  tvbutton : Button
    lateinit var bctbutton :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme)
        tvbutton =findViewById(R.id. tvbutton)
        bctbutton =findViewById(R.id.bctbutton )
        tvbutton.setOnClickListener {
            val intent = Intent (this,codememerd::class.java)
            startActivity(intent)
        }
        bctbutton.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
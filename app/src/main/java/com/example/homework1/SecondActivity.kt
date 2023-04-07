package com.example.homework1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var skip:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        skip=findViewById(R.id.button_Skip)

        skip.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))

        }


    }
}
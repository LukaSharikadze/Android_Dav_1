package com.example.homework1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var register:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register=findViewById(R.id.button_Register);

        register.setOnClickListener {

            var intent:Intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)


        }



    }
}
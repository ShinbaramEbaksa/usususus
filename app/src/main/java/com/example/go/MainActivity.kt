package com.example.go

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id = findViewById<TextView>(R.id.id)
        if(intent.hasExtra("input")){
        id.text=intent.getStringExtra("input")
        }
    }
}
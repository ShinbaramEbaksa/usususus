package com.example.go

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.login_btn)
        val id = findViewById<TextView>(R.id.id)
        val login1 = findViewById<EditText>(R.id.login1)

        button.setOnClickListener {
            if(login1.text.toString().trim().isBlank())
            Toast.makeText(this@LoginActivity, "ID를 입력하십시오", Toast.LENGTH_LONG)::show
            /*
            여기서 왜 안나올까요~~~~~
            일단 ID 입력 없으면 못 넘어가게 하는 건 되니까 소정의 목표는 달성^^
            */

            else {
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("input", login1.text.toString())
                startActivity(intent)
            }
        }
        }
    }
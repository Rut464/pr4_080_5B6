package com.example.pr4_080_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val tag="MainActivity"
    lateinit var login_btn1: Button
    lateinit var sign_up1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn1=findViewById(R.id.login_btn)
        login_btn1.setOnClickListener{
            val intent=Intent(this,MainLoginActivity::class.java)
            startActivity(intent)
        }
        sign_up1=findViewById(R.id.sign_btn)
        sign_up1.setOnClickListener{
            val intent=Intent(this,MainSignuupActivity::class.java)
            startActivity(intent)
        }

    }
}
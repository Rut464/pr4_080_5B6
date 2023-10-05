package com.example.pr4_080_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainLoginActivity : AppCompatActivity() {
    lateinit var signu_up:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        signu_up=findViewById(R.id.sign_up_btn)
        signu_up.setOnClickListener{
            val intent=Intent(this,MainSignuupActivity::class.java)
            startActivity(intent)
        }
    }
}
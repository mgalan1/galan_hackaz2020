package com.example.galan_hackaz2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var user: TextView
    lateinit var pass: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setUserInfo(){
        // TODO validate user exists in firebase
        user = findViewById(R.id.user)
        pass = findViewById(R.id.pass)
    }



}

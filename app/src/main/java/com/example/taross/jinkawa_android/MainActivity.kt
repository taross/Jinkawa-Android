package com.example.taross.jinkawa_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sendButton = findViewById(R.id.button) as Button
        sendButton.setOnClickListener({
                val intent = Intent(application, EventListActivity::class.java)
                startActivity(intent)
        })
    }
}

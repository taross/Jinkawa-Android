package com.example.taross.jinkawa_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context
import com.example.taross.model.Event
import com.example.taross.view.EventItemView

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

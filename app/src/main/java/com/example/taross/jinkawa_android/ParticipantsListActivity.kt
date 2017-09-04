package com.example.taross.jinkawa_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.widget.ListView

class ParticipantsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participants_list)

        val listView = findViewById(R.id.participant_list) as ListView
        val adapter = ParticipantsListAdapter(applicationContext)
        adapter.filterParticipants(intent.getStringExtra("EVENT_ID_EXTRA"))
        listView.adapter = adapter
    }
}

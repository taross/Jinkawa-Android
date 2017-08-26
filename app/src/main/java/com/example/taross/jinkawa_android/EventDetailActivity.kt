package com.example.taross.jinkawa_android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView
import com.example.taross.model.Event

class EventDetailActivity : AppCompatActivity() {

    companion object {
        private const val ITEM_EXTRA = "item"

        fun intent(context: Context, item: Event):Intent =
                Intent(context,EventDetailActivity::class.java).putExtra(ITEM_EXTRA, item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        val event:Event = intent.getParcelableExtra(ITEM_EXTRA)

        val toolBar = findViewById(R.id.detail_toolbar) as Toolbar
        toolBar.title = event.title

        val departmentTextView = findViewById(R.id.detail_department_name) as TextView
        departmentTextView.text = event.department

        val dateTextView = findViewById(R.id.detail_date) as TextView
        dateTextView.text = event.date

        val locationTextView = findViewById(R.id.detail_location) as TextView
        locationTextView.text = event.location

        val capacityTextView = findViewById(R.id.detail_capacity) as TextView
        capacityTextView.text = event.capacity

    }
}

package com.example.taross.jinkawa_android

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

import com.example.taross.model.Event
import com.example.taross.view.EventItemView

/**
 * Created by taross on 2017/08/12.
 */

class EventListAdapter(private val context: Context): BaseAdapter(){
    var items: List<Event> = emptyList()

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View = ((convertView as? EventItemView) ?: EventItemView(context)).apply {
        setItem(items[position])
    }

}
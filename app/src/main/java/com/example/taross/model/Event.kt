package com.example.taross.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by taross on 2017/08/12.
 */

data class Event(val title: String): Parcelable{
    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Event> = object : Parcelable.Creator<Event>{
            override fun createFromParcel(source: Parcel): Event = source.run {
                Event(readString())
            }

            override fun newArray(size: Int): Array<Event?> = arrayOfNulls(size)
        }
    }

    override fun describeContents(): Int = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.run {
            writeString(title)
        }
    }
}
package com.example.taross.model

import android.os.Parcel
import android.os.Parcelable
import android.provider.Telephony

/**
 * Created by taross on 2017/08/26.
 */
 data class Participant(val name:String, val age:String, val tell:String, val address:String, val gender:String):Parcelable{
    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Participant> = object : Parcelable.Creator<Participant>{
            override fun createFromParcel(source: Parcel): Participant = source.run {
                    Participant(readString(),readString(),readString(),readString(),readString())
                }


            override fun newArray(size: Int): Array<Participant?> = arrayOfNulls(size)
        }
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int = 0
}
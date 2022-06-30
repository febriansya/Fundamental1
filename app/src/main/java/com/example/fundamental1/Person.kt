package com.example.fundamental1


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name:String?,
    val age:Int?,
    val city:String?,
    val email:String?,
    val address:String?,
):Parcelable

package com.example.a2nd_lessonandroid_intensive_andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class Activity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_11)

        try {
            throw Exception("error")
        }catch (e: Exception){
            Log.e("TAG", "onCreate: testing log.e", )// задание из Android fundamentals 1.1
        }
    }
}
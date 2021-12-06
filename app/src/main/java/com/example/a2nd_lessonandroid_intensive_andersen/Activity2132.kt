package com.example.a2nd_lessonandroid_intensive_andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2132 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2132)
        var teV:TextView = findViewById(R.id.finalCount)
        teV.text=intent.getStringExtra("secret")
    }
}
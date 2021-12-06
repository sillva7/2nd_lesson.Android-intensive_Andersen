package com.example.a2nd_lessonandroid_intensive_andersen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Activity21_3rd : AppCompatActivity() {
    lateinit var buttonHello:Button
    lateinit var buttonCount:Button
    lateinit var textViewCount:TextView
    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity213rd)
        buttonCount = findViewById(R.id.count213)
        buttonHello = findViewById(R.id.hello)
        textViewCount = findViewById(R.id.show_count213)

        buttonCount.setOnClickListener {
            counter++
            textViewCount.text=counter.toString()
        }
    }



    fun showHello(view: View) {

        var intent: Intent = Intent(this, Activity2132::class.java)
        intent.putExtra("secret",textViewCount.text)
        startActivity(intent)


    }
}
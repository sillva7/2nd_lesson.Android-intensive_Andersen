package com.example.a2nd_lessonandroid_intensive_andersen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button11: Button = findViewById(R.id.button1_1)
        val button12a: Button = findViewById(R.id.button1_2a)
        val button12b: Button = findViewById(R.id.button1_2b)
        val button13: Button = findViewById(R.id.button1_3)
        val button14: Button = findViewById(R.id.button1_4)
        val button21: Button = findViewById(R.id.button2_1)
        val button22: Button = findViewById(R.id.button2_2)
        val button23: Button = findViewById(R.id.button2_3)




        button11.setOnClickListener{
            val intent11 = Intent(this, Activity11::class.java)
            startActivity(intent11)
        }

        button12a.setOnClickListener {
            val intent12a = Intent(this, Activity12a::class.java)
            startActivity(intent12a)
        }

        button12b.setOnClickListener{
            val intent12b = Intent(this, Activity12b::class.java)
            startActivity(intent12b)
        }
        button13.setOnClickListener {
            val intent13 = Intent(this, Activity13::class.java)
            startActivity(intent13)
        }
        button14.setOnClickListener {
            val intent14 = Intent(this, Activity14::class.java)
            startActivity(intent14)
        }
        button21.setOnClickListener {
            val intent21 = Intent(this, Activity21::class.java)
            startActivity(intent21)
        }
        button22.setOnClickListener{
            val intent22 = Intent(this, Activity22::class.java)
            startActivity(intent22)
        }

        button23.setOnClickListener {
            startActivity(Intent(this, Activity23::class.java))
        }





    }
}
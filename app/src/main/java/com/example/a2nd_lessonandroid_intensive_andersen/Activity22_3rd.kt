package com.example.a2nd_lessonandroid_intensive_andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity22_3rd : AppCompatActivity() {
    lateinit var editTextTest: EditText
    lateinit var button: Button
    lateinit var teV: TextView
    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity223rd)
        editTextTest = findViewById(R.id.editTextTest)
        teV = findViewById(R.id.counter)
        button = findViewById(R.id.buttontIncrement)

        button.setOnClickListener {
            count++
            teV.text=count.toString()
        }
        if(savedInstanceState!=null){
            editTextTest.setText(savedInstanceState.getString("secret2"))
            teV.text=savedInstanceState.getString("secret")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(!teV.text.isEmpty()){
            outState.putString("secret",teV.text.toString())
        }
        if(!editTextTest.text.toString().isEmpty()){
            outState.putString("secret2", editTextTest.text.toString())
        }
    }
}
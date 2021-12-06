package com.example.a2nd_lessonandroid_intensive_andersen

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Activity12b : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var mShowCount:TextView
    private lateinit var buttonCount: Button
    private lateinit var buttonZero: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity12b)
        mShowCount = findViewById(R.id.show_count)
        buttonCount = findViewById(R.id.count213)
        buttonZero = findViewById(R.id.zero)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, getString(R.string.toastText), Toast.LENGTH_LONG)
        toast.show()

    }

    fun countUp(view: View) {
        mCount++
        if(mCount%2==1) {
            buttonCount.setBackgroundColor(Color.GREEN)
        }
        else{
            buttonCount.setBackgroundColor(Color.RED)
        }
        if(mCount!=0){
            buttonZero.setBackgroundColor(Color.MAGENTA)
        }
        mShowCount.text = mCount.toString()
    }

    fun zero(view: View) {

        mCount=0
        mShowCount.text = mCount.toString()
        buttonZero.setBackgroundColor(Color.GRAY)




    }
}
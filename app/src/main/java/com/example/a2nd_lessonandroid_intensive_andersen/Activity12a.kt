package com.example.a2nd_lessonandroid_intensive_andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Activity12a : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var mShowCount:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_12)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, getString(R.string.toastText), Toast.LENGTH_LONG)
        toast.show()

    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }


}
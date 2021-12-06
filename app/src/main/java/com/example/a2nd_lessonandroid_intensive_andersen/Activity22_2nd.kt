package com.example.a2nd_lessonandroid_intensive_andersen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Activity22_2nd : AppCompatActivity() {
    private val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    private val LOG_TAG = Activity22_2nd::class.java.simpleName
    lateinit var editTextReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity222nd)
        var intent: Intent = getIntent()
        var message:String? = intent.getStringExtra(Activity21.EXTRA_MESSAGE)
        if (message != null) {
            Log.d("1333", message)//для своего отчёта
        }else{

        }
        var textView: TextView = findViewById(R.id.text_message)

        editTextReply = findViewById(R.id.editText_second)
        textView.text = message
    }

    fun returnReply(view: View) {

        var reply:String = editTextReply.text.toString()
        var replyIntent: Intent = Intent(this, Activity21::class.java)
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End SecondActivity ")
        finish()


    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy: ")
    }

    companion object {
        val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
        fun getMoreInfo(): String {
            return "com.example.a2nd_lessonandroid_intensive_andersen.extra.MESSAGE"
        }
    }
}
package com.example.a2nd_lessonandroid_intensive_andersen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Activity21_2nd : AppCompatActivity() {
    private val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    lateinit var editTextReply:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity212nd)
        var intent:Intent = getIntent()
        var message:String? = intent.getStringExtra(Activity21.EXTRA_MESSAGE)
        if (message != null) {
            Log.d("1333", message)//для своего отчёта
        }else{

        }
        var textView:TextView = findViewById(R.id.text_message)

        editTextReply = findViewById(R.id.editText_second)
        textView.text = message
    }

    fun returnReply(view: View) {

        var reply:String = editTextReply.text.toString()
        var replyIntent:Intent = Intent(this, Activity21::class.java)
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()


    }

    companion object {
        val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
        fun getMoreInfo(): String {
            return "com.example.a2nd_lessonandroid_intensive_andersen.extra.MESSAGE"
        }
    }
}
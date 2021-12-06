package com.example.a2nd_lessonandroid_intensive_andersen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Activity21 : AppCompatActivity() {

    private val TAG: String = MainActivity::class.java.simpleName
    private lateinit var messageEditText: EditText
    private val EXTRA_MESSAGE = "messgae: com.example.a2nd_lessonandroid_intensive_andersen.extra.MESSAGE"
    val TEXT_REQUEST:Int = 1
    private lateinit var textViewReplyHeadTextView:TextView
    private lateinit var textViewReplyTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_21)

        messageEditText = findViewById(R.id.editText_main)
        textViewReplyHeadTextView = findViewById(R.id.text_header_reply)
        textViewReplyTextView = findViewById(R.id.text_message_reply)

    }

    fun launchSecondActivity(view: View) {
        Log.d(TAG, "Button clicked")
        var launchSecondActivityIntent: Intent = Intent(this, Activity21_2nd::class.java)
        var message = messageEditText.text.toString()
        launchSecondActivityIntent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(launchSecondActivityIntent,TEXT_REQUEST)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                var reply: String? = data?.getStringExtra(Activity21_2nd.EXTRA_REPLY)
                textViewReplyHeadTextView.visibility = View.VISIBLE
                textViewReplyTextView.text = reply
                textViewReplyTextView.visibility = View.VISIBLE
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object {
        val EXTRA_MESSAGE = "messgae: com.example.a2nd_lessonandroid_intensive_andersen.extra.MESSAGE"
        val TEXT_REQUEST:Int = 1
        fun getMoreInfo(): String {
            return "com.example.a2nd_lessonandroid_intensive_andersen.extra.MESSAGE"
        }
    }

    fun toHomework(view: View) {

        var intent:Intent = Intent(this, Activity21_3rd::class.java)
        startActivity(intent)

    }
}
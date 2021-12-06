package com.example.a2nd_lessonandroid_intensive_andersen

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ShareCompat

class Activity23 : AppCompatActivity() {

    lateinit var mWebsiteEditText: EditText
    lateinit var mLocationEditText: EditText
    lateinit var mShareTextEditText:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_23)
        mWebsiteEditText = findViewById(R.id.website_edittext)
        mLocationEditText = findViewById(R.id.location_edittext)
        mShareTextEditText = findViewById(R.id.share_edittext)

        var intent:Intent = intent;
        var uri: Uri? = intent.data
        if( uri != null){
            var uri_string:String = mWebsiteEditText.text.toString() + uri.toString()

        }
    }

    fun openWebsite(view: View) {

        var url: String = mWebsiteEditText.text.toString()
        var webpage: Uri = Uri.parse(url)
        var intent: Intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!")
        }

    }

    fun openLocation(view: View) {

        var loc: String = mLocationEditText.text.toString()
        var addressUri: Uri = Uri.parse("geo:0,0?q=" + loc)
        var intent:Intent=Intent(Intent.ACTION_VIEW, addressUri)

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }

    }

    fun shareText(view: View) {

        var txt:String = mShareTextEditText.text.toString()
        var mimeType:String = "text/plain"
        ShareCompat.IntentBuilder.from(this)
            .setType(mimeType)
            .setChooserTitle(R.string.share_this_text)
            .setText(txt)
            .startChooser()

    }

    fun takePicture(view: View) {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, 1)
        } catch (e: ActivityNotFoundException) {
            Log.d("TAG", "takePicture: error")
        }
    }
}
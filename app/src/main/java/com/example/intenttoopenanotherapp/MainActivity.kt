package com.example.intenttoopenanotherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_google.setOnClickListener(this)
        btn_youtube.setOnClickListener(this)
        btn_facebook.setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        when (view!!.getId()) {
        //Launch google chrom after clicking a button
            R.id.btn_google -> {

                val launchGoogleChrome = packageManager.getLaunchIntentForPackage("com.android.chrome")
                startActivity(launchGoogleChrome)


            }
        //Launch youtube after clicking a button
            R.id.btn_youtube -> {

                val launchYouTubeIntent = packageManager.getLaunchIntentForPackage("com.google.android.youtube")
                startActivity(launchYouTubeIntent)


            }
        //launch facebook after button click
            R.id.btn_facebook -> {

                val launchFacebookIntent = packageManager.getLaunchIntentForPackage("com.facebook.katana")
                startActivity(launchFacebookIntent)


            }
        }

    }
}

//another method to launch Application through your app

// xml: android:onClick=""functionname"
/*
    //Launch google chrom after clicking a button
    fun launchGoogleChrome(view: View) {
        val launchGoogleChrome = packageManager.getLaunchIntentForPackage("com.android.chrome")
        startActivity(launchGoogleChrome)
    }

    //Launch youtube after clicking a button
    fun launchYouTube(view:View){

        val launchYouTubeIntent = packageManager.getLaunchIntentForPackage("com.google.android.youtube")
        startActivity(launchYouTubeIntent)
    }

    //launch facebook after button click

    fun launchFaceBook(view:View)

    {
        val launchFacebookIntent = packageManager.getLaunchIntentForPackage("com.facebook.katana")
        startActivity(launchFacebookIntent)
    }
}
*/
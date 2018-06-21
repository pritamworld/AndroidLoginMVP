package com.pritesh.loginmvp

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    lateinit var imgBablo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //startActivity(Intent(this, MainActivity::class.java))
        imgBablo = findViewById(R.id.imgBablo)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)

        if (newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            imgBablo.setImageResource(R.drawable.ic_bablo_port)
            Toast.makeText(this, "ORIENTATION_LANDSCAPE", Toast.LENGTH_SHORT).show()
        } else {
            imgBablo.setImageResource(R.drawable.ic_bablo_land)
            Toast.makeText(this, "ORIENTATION_PORTRAIT", Toast.LENGTH_SHORT).show()
        }
    }
}

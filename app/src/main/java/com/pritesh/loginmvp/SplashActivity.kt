package com.pritesh.loginmvp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pritesh.loginmvp.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startActivity(Intent(this, LoginActivity::class.java))
    }
}

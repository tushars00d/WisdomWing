package com.example.wisdomwing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager


class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setupActionBar()
    }

    private fun setupActionBar() {
        val toolbarSignUpActivity = supportActionBar
        toolbarSignUpActivity?.setDisplayHomeAsUpEnabled(true)
        toolbarSignUpActivity?.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
    }



}

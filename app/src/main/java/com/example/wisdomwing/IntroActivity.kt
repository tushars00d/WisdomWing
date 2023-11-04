package com.example.wisdomwing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.content.Intent // Import Intent class
import android.widget.Button
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class IntroActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        // Initialize Firebase Auth
        auth = Firebase.auth

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        // Add a click event for the Sign Up button
        val btn_sign_up_intro : Button = findViewById(R.id.btn_sign_up_intro)
        btn_sign_up_intro.setOnClickListener {
            // Launch the Sign Up screen
            startActivity(Intent(this@IntroActivity, SignUpActivity::class.java))
        }

        val btn_sign_in_intro : Button = findViewById(R.id.btn_sign_in_intro)
        btn_sign_in_intro.setOnClickListener {
            // Launch the Sign Up screen
            startActivity(Intent(this@IntroActivity, SignInActivity::class.java))
        }

    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
            //move to home feed
        }
    }
}

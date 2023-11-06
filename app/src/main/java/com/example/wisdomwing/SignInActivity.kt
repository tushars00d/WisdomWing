package com.example.wisdomwing

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.trimmedLength
import com.example.wisdomwing.databinding.ActivitySignInBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth
        auth = Firebase.auth

        // This is used to hide the status bar and make the splash screen a full-screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setupActionBar()

        binding.btnSignIn.setOnClickListener {
            if (binding.etEmail.text!!.isNotEmpty() && binding.etPassword.text!!.isNotEmpty()) {
                signIn(binding.etEmail.text.toString(), binding.etPassword.text.toString())
            }
        }

    }

    private fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Logged In Successfully", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(
                        baseContext,
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                }
            }
    }

    private fun setupActionBar() {
        val toolbar_sign_in_activity = supportActionBar
        toolbar_sign_in_activity?.setDisplayHomeAsUpEnabled(true)
        toolbar_sign_in_activity?.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)

        //toolbar_sign_in_activity.setNavigationOnClickListener { onBackPressed() }
    }

    /**
     * A function for Sign-In using the registered user using the email and password.
     */
//    private fun signInRegisteredUser() {
//        // Here we get the text from editText and trim the space
//        val email: String = et_email.text.toString().trim()
//        val password: String = et_password.text.toString().trim()
//
//        if (validateForm(email, password)) {
//            // Show the progress dialog.
//            // showProgressDialog(resources.getString(R.string.please_wait))
//
//            // Sign-In using FirebaseAuth
//            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener { task ->
//                    if (task.isSuccessful) {
//                        // Calling the FirestoreClass signInUser function to get the data of the user from the database.
//                        // FirestoreClass().loadUserData(this@SignInActivity)
//                        // You can add the Firestore user data retrieval logic here.
//                        // For example, if you store user data in Firestore.
//                    } else {
//                        Toast.makeText(
//                            this@SignInActivity,
//                            task.exception?.message,
//                            Toast.LENGTH_LONG
//                        ).show()
//                    }
//                }
//        }
//    }
//
//    /**
//     * A function to validate the entries of a user.
//     */
//    private fun validateForm(email: String, password: String): Boolean {
//        return when {
//            email.isBlank() -> {
//                showErrorSnackBar("Please enter email.")
//                false
//            }
//            password.isBlank() -> {
//                showErrorSnackBar("Please enter a password.")
//                false
//            }
//            else -> true
//        }
//    }

    // You may need to implement the `signInSuccess` function as per your requirements.
}

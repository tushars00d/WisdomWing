package com.example.wisdomwing

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.trimmedLength
import com.google.firebase.auth.FirebaseAuth


class SignInActivity : AppCompatActivity() {
    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        // This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the XML view to this class
        setContentView(R.layout.activity_sign_in)

        // This is used to hide the status bar and make the splash screen a full-screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setupActionBar()

//        btn_sign_in.setOnClickListener {
//            signInRegisteredUser()
//        }
    }

    /**
     * A function for actionBar Setup.
     */
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

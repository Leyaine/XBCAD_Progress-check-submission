package com.example.tastech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.MainActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Find the TextView for "Don't have an account? Sign Up"
        val signUpLink: TextView = findViewById(R.id.tvGoToSignUp)

        // Set click listener to navigate to SignUpActivity
        signUpLink.setOnClickListener {
            // Create an intent to navigate to SignUpActivity
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Find the TextView for "Forgot password?"
        val forgotPasswordLink: TextView = findViewById(R.id.tvForgotPassword)

        // Set click listener to navigate to ForgotPasswordActivity
        forgotPasswordLink.setOnClickListener {
            // Create an intent to navigate to ForgotPasswordActivity
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for button to navigate to ActivityMain
        val signIn: Button = findViewById(R.id.btnSignIn)

        signIn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}

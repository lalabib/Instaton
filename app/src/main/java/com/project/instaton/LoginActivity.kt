package com.project.instaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var inputEmail: EditText
    private lateinit var inputPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionbar = supportActionBar
        actionbar!!.hide()

        btnLogin = findViewById(R.id.btnLogin)
        inputEmail = findViewById(R.id.inputEmail)
        inputPassword = findViewById(R.id.inputPassword)

        btnLogin.setOnClickListener{
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Please insert Email and Password!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (email == "username@gmail.com" && password == "password"){
                val intent = Intent (this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
                Toast.makeText(this, "Your Email or Password is Incorrect!", Toast.LENGTH_SHORT).show()
        }
    }
}
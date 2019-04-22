package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        setOnClicks()
    }

    private fun setOnClicks() {
        val usernameTxt = findViewById<TextInputLayout>(R.id.username_field)
        val passwordTxt = findViewById<TextInputLayout>(R.id.password_field)


       findViewById<Button>(R.id.login_button).setOnClickListener {
           when(usernameTxt.editText?.text.toString()) {
               "admin" -> {
                   if(passwordTxt.editText?.text.toString() == "admin") {
                       val mIntent = Intent(this, MainActivity::class.java)
                       mIntent.putExtra("admin", true)
                       startActivity(mIntent)
                   } else {
                       passwordTxt.error = "Incorrect credentials"
                       passwordTxt.isErrorEnabled = true
                   }

               }
               "user" -> {
                   if(passwordTxt.editText?.text.toString() == "user") {
                       val mIntent = Intent(this, MainActivity::class.java)
                       mIntent.putExtra("admin", false)
                       startActivity(mIntent)
                   } else {
                       passwordTxt.error = "Incorrect credentials"
                       passwordTxt.isErrorEnabled = true
                   }

               }
               else -> {

                   passwordTxt.error = "Incorrect credentials"
                   passwordTxt.isErrorEnabled = true
               }
           }
       }
        findViewById<Button>(R.id.assistance_button).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:0123456789")
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        startActivity(intent)
    }
}
package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class AdminUsersActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_alarmas)

        val alarma = intent?.extras?.getBoolean("alarma") ?: false

        val imPersona1 = findViewById<ImageView>(R.id.imPersona1)
        val imPersona2 = findViewById<ImageView>(R.id.imPersona2)
        val imPeronsa3 = findViewById<ImageView>(R.id.imPeronsa3)

        imPersona1.setOnClickListener {
            val mIntent =
                    if(alarma)Intent(this, Alarmas2::class.java)
                    else Intent(this, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
        imPersona2.setOnClickListener {

            val mIntent =
                    if(alarma)Intent(this, Alarmas2::class.java)
                    else Intent(this, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
        imPeronsa3.setOnClickListener {

            val mIntent =
                    if(alarma)Intent(this, Alarmas2::class.java)
                    else Intent(this, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
    }
}
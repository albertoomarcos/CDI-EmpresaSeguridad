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

        var imPersona1 = findViewById(R.id.imPersona1) as ImageView
        var imPersona2 = findViewById(R.id.imPersona2) as ImageView
        var imPeronsa3 = findViewById(R.id.imPeronsa3) as ImageView

        imPersona1.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent =
                    if(alarma)Intent(this, Alarmas2::class.java)
                    else Intent(this, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
        imPersona2.setOnClickListener {
            // your code to perform when the user clicks on the button

            val mIntent =
                    if(alarma)Intent(this, Alarmas2::class.java)
                    else Intent(this, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
        imPeronsa3.setOnClickListener {
            // your code to perform when the user clicks on the button

            val mIntent =
                    if(alarma)Intent(this, Alarmas2::class.java)
                    else Intent(this, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
    }
}
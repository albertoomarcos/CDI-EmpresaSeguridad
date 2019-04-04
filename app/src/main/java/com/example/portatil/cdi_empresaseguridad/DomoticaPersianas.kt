package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaPersianas: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_persianas)

        var imPSinPers = findViewById(R.id.imPSinPers) as ImageView
        var imPConPers = findViewById(R.id.imPConPers) as ImageView

        imPSinPers.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imPConPers.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }

    }
}
package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaBanio: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_banio)
        val imAniadirLuz = findViewById<ImageView>(R.id.imAniadirLuz)
        val imAniadirSensor = findViewById<ImageView>(R.id.imAniadirSensor)

        imAniadirLuz.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imAniadirSensor.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
    }
}
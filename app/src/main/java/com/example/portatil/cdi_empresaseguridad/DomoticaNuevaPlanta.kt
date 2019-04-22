package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaNuevaPlanta: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_nueva_planta)

        val imDespacho = findViewById<ImageView>(R.id.imDespacho2)
        val imSalaComun = findViewById<ImageView>(R.id.imSalaComun2)
        val imBanio = findViewById<ImageView>(R.id.imBanio2)
        val imSalaServidores = findViewById<ImageView>(R.id.imSalaServidores2)

        imDespacho.setOnClickListener {
            val mIntent = Intent(this, DomoticaDespacho::class.java)
            startActivity(mIntent)
        }
        imSalaComun.setOnClickListener {
            val mIntent = Intent(this, DomoticaSalaComun::class.java)
            startActivity(mIntent)
        }
        imBanio.setOnClickListener {
            val mIntent = Intent(this, DomoticaBanio::class.java)
            startActivity(mIntent)
        }
        imSalaServidores.setOnClickListener {
            val mIntent = Intent(this, DomoticaServidores::class.java)
            startActivity(mIntent)
        }

    }
}
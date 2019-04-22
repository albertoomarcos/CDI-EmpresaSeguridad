package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaSalaComunOtros: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_sala_comun_otros)

        val imCafe = findViewById<ImageView>(R.id.imATemp)
        val imFotocopiadora = findViewById<ImageView>(R.id.imAPresencia)
        val imMico = findViewById<ImageView>(R.id.imAAscensor)



        imCafe.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imFotocopiadora.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imMico.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
    }
}
package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaSalaComun: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_sala_comun)

        val imLuz = findViewById<ImageView>(R.id.imLuz2)
        val imTemp = findViewById<ImageView>(R.id.imTemp2)
        val imPuerta = findViewById<ImageView>(R.id.imPuerta2)
        val imVentana = findViewById<ImageView>(R.id.imVentana2)
        val imOtros = findViewById<ImageView>(R.id.imOtros2)

        imLuz.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imTemp.setOnClickListener {
            val mIntent = Intent(this, DomoticaControl::class.java)
            startActivity(mIntent)
        }
        imPuerta.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imVentana.setOnClickListener {
            val mIntent = Intent(this, DomoticaPersianas::class.java)
            startActivity(mIntent)

        }
        imOtros.setOnClickListener{
            val mIntent = Intent(this, DomoticaSalaComunOtros::class.java)
            startActivity(mIntent)

        }
    }
}
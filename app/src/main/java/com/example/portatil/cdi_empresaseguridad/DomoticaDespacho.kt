package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaDespacho: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_despacho)

        val imLuz = findViewById<ImageView>(R.id.imGestionClaves)
        val imTemp = findViewById<ImageView>(R.id.imPolicia)
        val imPuerta = findViewById<ImageView>(R.id.imIncidencias)
        val imVentana = findViewById<ImageView>(R.id.imGestionServicios)
        val imOtros = findViewById<ImageView>(R.id.imHistorico)

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
            val mIntent = Intent(this, DomoticaDespachoOtros::class.java)
            startActivity(mIntent)

        }
    }
}
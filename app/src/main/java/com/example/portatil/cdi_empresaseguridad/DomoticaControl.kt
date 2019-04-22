package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaControl: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aniadir_control)

        val imTermo = findViewById<ImageView>(R.id.imTermo)
        val imAC = findViewById<ImageView>(R.id.imAC)
        val imRadiador = findViewById<ImageView>(R.id.imRadiador)


        imTermo.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imAC.setOnClickListener {

            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imRadiador.setOnClickListener {

            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
    }
}
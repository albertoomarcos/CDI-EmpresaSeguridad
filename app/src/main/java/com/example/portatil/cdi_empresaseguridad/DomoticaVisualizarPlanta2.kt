package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaVisualizarPlanta2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_planta_2)

        val imDespacho = findViewById<ImageView>(R.id.imDespacho2)
        val imSalaComun = findViewById<ImageView>(R.id.imSalaComun2)
        val imBanio = findViewById<ImageView>(R.id.imBanio2)
        val imSalaServidores = findViewById<ImageView>(R.id.imSalaServidores2)

        imDespacho.setOnClickListener {
            val mIntent = Intent(this, CDespacho::class.java)
            mIntent.putExtra("number", 4)
            startActivity(mIntent)

        }
        imSalaComun.setOnClickListener {
            val mIntent = Intent(this, CSalaComun::class.java)
            mIntent.putExtra("number", 1)
            startActivity(mIntent)

        }
        imBanio.setOnClickListener {
            val mIntent = Intent(this, CBanio::class.java)
            mIntent.putExtra("number", 4)
            startActivity(mIntent)

        }
        imSalaServidores.setOnClickListener {
            val mIntent = Intent(this, CServidor::class.java)
            mIntent.putExtra("number", 1)
            startActivity(mIntent)

        }

    }
}
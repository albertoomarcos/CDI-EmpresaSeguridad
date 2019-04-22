package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaVisualizarPlanta1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_planta_1)

        val imPlanta1 = findViewById<ImageView>(R.id.imPlanta1)
        val imPlanta2 = findViewById<ImageView>(R.id.imPlanta2)
        val imPlanta3 = findViewById<ImageView>(R.id.imPlanta3)



        imPlanta1.setOnClickListener {
            val mIntent = Intent(this, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta2.setOnClickListener {
            val mIntent = Intent(this, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta3.setOnClickListener {
            val mIntent = Intent(this, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
    }
}

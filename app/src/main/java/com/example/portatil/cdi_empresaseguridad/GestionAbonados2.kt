package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class GestionAbonados2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_gestion_abonados_2)

        val imGestionClaves = findViewById<ImageView>(R.id.imGestionClaves)
        val imPolicia = findViewById<ImageView>(R.id.imPolicia)
        val imIncidencias = findViewById<ImageView>(R.id.imIncidencias)
        val imGestionServicios = findViewById<ImageView>(R.id.imGestionServicios)
        val imHistorico = findViewById<ImageView>(R.id.imHistorico)
        val imDispositivos = findViewById<ImageView>(R.id.imDispositivos)
        val imFalsasAlarmas = findViewById<ImageView>(R.id.imFalsasAlarmas)

        imGestionClaves.setOnClickListener {
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)

        }
        imPolicia.setOnClickListener {
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imIncidencias.setOnClickListener {
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imGestionServicios.setOnClickListener {
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imHistorico.setOnClickListener {
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imDispositivos.setOnClickListener {
            val mIntent = Intent(this, DomoticaItemsControl1::class.java)
            startActivity(mIntent)
        }
        imFalsasAlarmas.setOnClickListener {
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }


    }
}
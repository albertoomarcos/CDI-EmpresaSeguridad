package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class GestionAbonados2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_gestion_abonados_2)

        var imDescripcion = findViewById(R.id.imDescripcion) as ImageView
        var imGestionClaves = findViewById(R.id.imGestionClaves) as ImageView
        var imPolicia = findViewById(R.id.imPolicia) as ImageView
        var imIncidencias = findViewById(R.id.imIncidencias) as ImageView
        var imGestionServicios = findViewById(R.id.imGestionServicios) as ImageView
        var imHistorico = findViewById(R.id.imHistorico) as ImageView
        var imDispositivos = findViewById(R.id.imDispositivos) as ImageView
        var imFalsasAlarmas = findViewById(R.id.imFalsasAlarmas) as ImageView

        imGestionClaves.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)

        }
        imPolicia.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imIncidencias.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imGestionServicios.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imHistorico.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imDispositivos.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaItemsControl1::class.java)
            startActivity(mIntent)
        }
        imFalsasAlarmas.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }


    }
}
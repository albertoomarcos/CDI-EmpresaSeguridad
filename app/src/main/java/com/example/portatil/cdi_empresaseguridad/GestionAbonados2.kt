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
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()

        }
        imPolicia.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()
        }
        imIncidencias.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()
        }
        imGestionServicios.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()
        }
        imHistorico.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()
        }
        imDispositivos.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()
        }
        imFalsasAlarmas.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@GestionAbonados2, "TODO", Toast.LENGTH_SHORT).show()
        }


    }
}
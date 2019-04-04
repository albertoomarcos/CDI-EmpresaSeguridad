package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaNuevaPlanta: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_nueva_planta)

        var imDespacho = findViewById(R.id.imDespacho) as ImageView
        var imSalaComun = findViewById(R.id.imSalaComun) as ImageView
        var imBanio = findViewById(R.id.imBanio) as ImageView
        var imSalaServidores = findViewById(R.id.imSalaServidores) as ImageView

        imDespacho.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Despacho", Toast.LENGTH_SHORT).show()

        }
        imSalaComun.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Sala Comun", Toast.LENGTH_SHORT).show()
        }
        imBanio.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Banio", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaBanio::class.java)
            startActivity(mIntent)
        }
        imSalaServidores.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Sala Servidores", Toast.LENGTH_SHORT).show()
            //val mIntent = Intent(this, AdminAlarmasActivity::class.java)
            //startActivity(mIntent)
        }

    }
}
package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaNuevaPlanta: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_nueva_planta)

        var imDespacho = findViewById(R.id.imDespacho2) as ImageView
        var imSalaComun = findViewById(R.id.imSalaComun2) as ImageView
        var imBanio = findViewById(R.id.imBanio2) as ImageView
        var imSalaServidores = findViewById(R.id.imSalaServidores2) as ImageView

        imDespacho.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Despacho", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaDespacho::class.java)
            startActivity(mIntent)
        }
        imSalaComun.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Sala Comun", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaSalaComun::class.java)
            startActivity(mIntent)
        }
        imBanio.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Banio", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaBanio::class.java)
            startActivity(mIntent)
        }
        imSalaServidores.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaNuevaPlanta, "Vamos a gestion Sala Servidores", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaServidores::class.java)
            startActivity(mIntent)
        }

    }
}
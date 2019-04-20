package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaDespachoOtros: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_despacho_otros)

        var imFax = findViewById(R.id.imFax) as ImageView
        var imPC = findViewById(R.id.imPC) as ImageView
        var imTelefono = findViewById(R.id.imTelefono) as ImageView

        imFax.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imPC.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imTelefono.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "3", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }

    }
}
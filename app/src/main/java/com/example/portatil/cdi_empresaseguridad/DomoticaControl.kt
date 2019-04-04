package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaControl: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aniadir_control)

        var imTermo = findViewById(R.id.imTermo) as ImageView
        var imAC = findViewById(R.id.imAC) as ImageView
        var imRadiador = findViewById(R.id.imRadiador) as ImageView


        imTermo.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imAC.setOnClickListener {
            // your code to perform when the user clicks on the button

            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imRadiador.setOnClickListener {
            // your code to perform when the user clicks on the button

            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
    }
}
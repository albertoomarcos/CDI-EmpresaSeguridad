package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaFinal: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_fin)

        var imAtras = findViewById(R.id.imAtras) as ImageView
        var imAniadir = findViewById(R.id.imAniadir) as ImageView

        imAtras.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaFinal, "Volver atras", Toast.LENGTH_SHORT).show()

        }
        imAniadir.setOnClickListener {
            // your code to perform when the user clicks on the button.
            //HABRIA QUE REVISAR QUE PONGA ALGO EN LOS EDIT TEXT!!! NO SE HACERLO
            Toast.makeText(this@DomoticaFinal, "Añadido con exito...", Toast.LENGTH_LONG).show()
            val mIntent = Intent(this, DomoticaNuevaPlanta::class.java)
            startActivity(mIntent)
        }

    }
}
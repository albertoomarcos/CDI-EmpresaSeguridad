package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaSalaComun: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_sala_comun)

        var imLuz = findViewById(R.id.imLuz2) as ImageView
        var imTemp = findViewById(R.id.imTemp2) as ImageView
        var imPuerta = findViewById(R.id.imPuerta2) as ImageView
        var imVentana = findViewById(R.id.imVentana2) as ImageView
        var imOtros = findViewById(R.id.imOtros2) as ImageView

        imLuz.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imTemp.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaControl::class.java)
            startActivity(mIntent)
        }
        imPuerta.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "3", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }
        imVentana.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaPersianas::class.java)
            startActivity(mIntent)

        }
        imOtros.setOnClickListener{
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaSalaComun, "5", Toast.LENGTH_SHORT).show()

        }
    }
}
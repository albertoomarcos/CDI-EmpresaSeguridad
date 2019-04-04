package com.example.portatil.cdi_empresaseguridad

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaBanio: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_banio)
        var imAniadirLuz = findViewById(R.id.imAniadirLuz) as ImageView
        var imAniadirSensor = findViewById(R.id.imAniadirSensor) as ImageView

        imAniadirLuz.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaBanio, "Vamos a Añadir luz", Toast.LENGTH_SHORT).show()

        }
        imAniadirSensor.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaBanio, "Vamos a Añadir Sensor", Toast.LENGTH_SHORT).show()
        }
    }
}
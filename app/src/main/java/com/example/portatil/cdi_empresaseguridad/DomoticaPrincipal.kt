package com.example.portatil.cdi_empresaseguridad

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaPrincipal: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_principal)

        var imAniadirNueva = findViewById(R.id.imAniadirNueva) as ImageView
        var imVisualizarPlantas = findViewById(R.id.imVisualizarPlantas) as ImageView

        imAniadirNueva.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaPrincipal, "Vamos a añadir nueva planta", Toast.LENGTH_SHORT).show()
        }
        imVisualizarPlantas.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaPrincipal, "Vamos a Visualizar Planta", Toast.LENGTH_SHORT).show()
        }

    }

}
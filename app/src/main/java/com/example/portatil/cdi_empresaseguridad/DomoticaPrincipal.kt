package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class DomoticaPrincipal: Fragment() {

    companion object {

        fun newInstance(): DomoticaPrincipal {
            return DomoticaPrincipal()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_domotica_principal, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var imAniadirNueva = view.findViewById(R.id.imAniadirNueva) as ImageView
        var imVisualizarPlantas = view.findViewById(R.id.imVisualizarPlantas) as ImageView

        imAniadirNueva.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(view.context, DomoticaNuevaPlanta::class.java)
            startActivity(mIntent)
        }
        imVisualizarPlantas.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(view.context, "Vamos a Visualizar Planta", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta1::class.java)
            startActivity(mIntent)
        }
    }

}
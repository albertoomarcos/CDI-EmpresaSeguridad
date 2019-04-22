package com.example.portatil.cdi_empresaseguridad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class DomoticaPrincipal: Fragment() {

    companion object {

        fun newInstance(): DomoticaPrincipal {
            return DomoticaPrincipal()
        }
    }

    @SuppressLint("InflateParams")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_domotica_principal, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imAniadirNueva = view.findViewById(R.id.imAniadirNueva) as ImageView
        val imVisualizarPlantas = view.findViewById(R.id.imVisualizarPlantas) as ImageView

        imAniadirNueva.setOnClickListener {
            val mIntent = Intent(view.context, DomoticaNuevaPlanta::class.java)
            startActivity(mIntent)
        }
        imVisualizarPlantas.setOnClickListener {
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta1::class.java)
            startActivity(mIntent)
        }
    }

}
package com.example.portatil.cdi_empresaseguridad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class DomoticaPrincipalUser: Fragment() {

    companion object {

        fun newInstance(): DomoticaPrincipalUser {
            return DomoticaPrincipalUser()
        }
    }

    @SuppressLint("InflateParams")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_visualizar_planta_1, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imPlanta1 = view.findViewById(R.id.imPlanta1) as ImageView
        val imPlanta2 = view.findViewById(R.id.imPlanta2) as ImageView
        val imPlanta3 = view.findViewById(R.id.imPlanta3) as ImageView



        imPlanta1.setOnClickListener {
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta2.setOnClickListener {
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta3.setOnClickListener {
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
    }

}
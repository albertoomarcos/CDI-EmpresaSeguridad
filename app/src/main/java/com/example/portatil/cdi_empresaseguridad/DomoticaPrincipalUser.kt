package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class DomoticaPrincipalUser: Fragment() {

    companion object {

        fun newInstance(): DomoticaPrincipalUser {
            return DomoticaPrincipalUser()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_visualizar_planta_1, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var imPlanta1 = view.findViewById(R.id.imPlanta1) as ImageView
        var imPlanta2 = view.findViewById(R.id.imPlanta2) as ImageView
        var imPlanta3 = view.findViewById(R.id.imPlanta3) as ImageView



        imPlanta1.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta2.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta3.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "3", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(view.context, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
    }

}
package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class AdminMainFragment: Fragment() {

    companion object {

        fun newInstance(): AdminMainFragment {
            return AdminMainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_admin, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var imServicios = view.findViewById(R.id.imTermo) as ImageView
        var imGestion = view.findViewById(R.id.imGestion) as ImageView
        var imAlarmas = view.findViewById(R.id.imAlarmas) as ImageView

        imServicios.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(view.context, "Vamos a Servicios contratados", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(view.context, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imGestion.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(view.context, "Vamos a GESTION ABONADOS", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(view.context, GestionAbonados2::class.java)
            startActivity(mIntent)
        }
        imAlarmas.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(view.context, "Vamos a CENTRAL ALARMAS", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(view.context, AdminAlarmasActivity::class.java)
            startActivity(mIntent)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}
package com.example.portatil.cdi_empresaseguridad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class AdminMainFragment: Fragment() {

    companion object {

        fun newInstance(): AdminMainFragment {
            return AdminMainFragment()
        }
    }

    @SuppressLint("InflateParams")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_admin, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val imServicios = view.findViewById(R.id.imTermo) as ImageView
        val imGestion = view.findViewById(R.id.imGestion) as ImageView
        val imAlarmas = view.findViewById(R.id.imAlarmas) as ImageView

        imServicios.setOnClickListener {
            val mIntent = Intent(view.context, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imGestion.setOnClickListener {
            val mIntent = Intent(view.context, AdminUsersActivity::class.java)
            mIntent.putExtra("alarma", false)
            startActivity(mIntent)
        }
        imAlarmas.setOnClickListener {
            val mIntent = Intent(view.context, AdminUsersActivity::class.java)
            mIntent.putExtra("alarma", true)
            startActivity(mIntent)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}
package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class Alarmas2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmas_2)

        val imAPresencia = findViewById<ImageView>(R.id.imAPresencia)
        val imATemp = findViewById<ImageView>(R.id.imATemp)
        val imAAscensor = findViewById<ImageView>(R.id.imAAscensor)

        imAPresencia.setOnClickListener {
            val mIntent = Intent(this, ActivityNotificacionesAlarmasPresencia::class.java)
            startActivity(mIntent)
        }
        imATemp.setOnClickListener {
            val mIntent = Intent(this, ActivityNotificacionesAlarmasTemperatura::class.java)
            startActivity(mIntent)
        }
        imAAscensor.setOnClickListener {
            val mIntent = Intent(this, ActivityNotificacionesAlarmasAscensores::class.java)
            startActivity(mIntent)
        }
    }
}
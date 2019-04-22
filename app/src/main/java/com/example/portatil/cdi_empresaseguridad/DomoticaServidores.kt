package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaServidores: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servidores)

        val imSensorTemp = findViewById<ImageView>(R.id.imSensorTemp)


        imSensorTemp.setOnClickListener {
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }

    }
}

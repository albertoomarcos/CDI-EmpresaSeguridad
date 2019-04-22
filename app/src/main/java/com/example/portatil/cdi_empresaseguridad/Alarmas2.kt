package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class Alarmas2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmas_2)

        var imAPresencia = findViewById(R.id.imAPresencia) as ImageView
        var imATemp = findViewById(R.id.imATemp) as ImageView
        var imAAscensor = findViewById(R.id.imAAscensor) as ImageView

        imAPresencia.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imATemp.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
        imAAscensor.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, ServiciosContratados::class.java)
            startActivity(mIntent)
        }
    }
}
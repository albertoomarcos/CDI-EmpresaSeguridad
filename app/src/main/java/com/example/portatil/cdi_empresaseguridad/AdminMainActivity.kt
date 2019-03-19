package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class AdminMainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_admin)

        val imServicios = findViewById(R.id.imServicios) as ImageView
        val imEstancias = findViewById(R.id.imEstancias) as ImageView
        val imGestion = findViewById(R.id.imGestion) as ImageView
        val imAlarmas = findViewById(R.id.imAlarmas) as ImageView

        imServicios.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@AdminMainActivity, "Vamos a Servicios contratados", Toast.LENGTH_SHORT).show()

        }
        imEstancias.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@AdminMainActivity, "Vamos a ESTANCIAS CLIENTE", Toast.LENGTH_SHORT).show()
        }
        imGestion.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@AdminMainActivity, "Vamos a GESTION ABONADOS", Toast.LENGTH_SHORT).show()
        }
        imAlarmas.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@AdminMainActivity, "Vamos a CENTRAL ALARMAS", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, AdminAlarmasActivity::class.java)
            startActivity(mIntent)
        }
    }
}
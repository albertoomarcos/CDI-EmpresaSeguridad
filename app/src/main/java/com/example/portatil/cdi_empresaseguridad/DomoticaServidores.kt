package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaServidores: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servidores)

        var imSensorTemp = findViewById(R.id.imSensorTemp) as ImageView


        imSensorTemp.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaFinal::class.java)
            startActivity(mIntent)
        }

    }
}

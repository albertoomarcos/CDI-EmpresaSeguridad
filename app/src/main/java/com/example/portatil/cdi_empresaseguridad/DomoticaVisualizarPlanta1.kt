package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaVisualizarPlanta1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_planta_1)

        var imPlanta1 = findViewById(R.id.imPlanta1) as ImageView
        var imPlanta2 = findViewById(R.id.imPlanta2) as ImageView
        var imPlanta3 = findViewById(R.id.imPlanta3) as ImageView



        imPlanta1.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "1", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta2.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
        imPlanta3.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@DomoticaDespacho, "3", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaVisualizarPlanta2::class.java)
            startActivity(mIntent)
        }
    }
}

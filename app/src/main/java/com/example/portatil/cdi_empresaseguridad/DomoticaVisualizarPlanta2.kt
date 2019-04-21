package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class DomoticaVisualizarPlanta2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_planta_2)

        var imDespacho = findViewById(R.id.imDespacho2) as ImageView
        var imSalaComun = findViewById(R.id.imSalaComun2) as ImageView
        var imBanio = findViewById(R.id.imBanio2) as ImageView
        var imSalaServidores = findViewById(R.id.imSalaServidores2) as ImageView

        imDespacho.setOnClickListener {
            // your code to perform when the user clicks on the button
            val mIntent = Intent(this, DomoticaItemsControl1::class.java)
            startActivity(mIntent)

        }
        imSalaComun.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaVisualizarPlanta2, "TODO", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaItemsControl2::class.java)
            startActivity(mIntent)

        }
        imBanio.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaVisualizarPlanta2, "TODO", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaItemsControl1::class.java)
            startActivity(mIntent)

        }
        imSalaServidores.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@DomoticaVisualizarPlanta2, "TODO", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(this, DomoticaItemsControl2::class.java)
            startActivity(mIntent)

        }

    }
}
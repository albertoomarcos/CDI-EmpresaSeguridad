package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity

class CServidor: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_servidor)


        val number = intent?.extras?.getInt("number") ?: 0

        if(number >=1)
            (findViewById<ConstraintLayout>(R.id.place1)).setOnClickListener {
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }

    }
}
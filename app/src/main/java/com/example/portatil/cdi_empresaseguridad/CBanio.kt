package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity

class CBanio: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_banio)


        val number = intent?.extras?.getInt("number") ?: 0

        if(number >=1)
            (findViewById<ConstraintLayout>(R.id.place1)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }

        if(number >=2)
            (findViewById<ConstraintLayout>(R.id.place2)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }

        if(number >=3)
            (findViewById<ConstraintLayout>(R.id.place3)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }

        if(number >=4)
            (findViewById<ConstraintLayout>(R.id.place4)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }

    }
}
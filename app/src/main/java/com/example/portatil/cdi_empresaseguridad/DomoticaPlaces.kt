package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class DomoticaPlaces: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places_domotica)

        val number = intent?.extras?.getInt("number") ?: 0

        if(number >=1)
            (findViewById<ConstraintLayout>(R.id.place1)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place1)).visibility = ConstraintLayout.GONE

        if(number >=2)
            (findViewById<ConstraintLayout>(R.id.place2)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place2)).visibility = ConstraintLayout.GONE

        if(number >=3)
            (findViewById<ConstraintLayout>(R.id.place3)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place3)).visibility = ConstraintLayout.GONE

        if(number >=4)
            (findViewById<ConstraintLayout>(R.id.place4)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place4)).visibility = ConstraintLayout.GONE

        if(number >=5)
            (findViewById<ConstraintLayout>(R.id.place5)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place5)).visibility = ConstraintLayout.GONE

        if(number >=6)
            (findViewById<ConstraintLayout>(R.id.place6)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place6)).visibility = ConstraintLayout.GONE

        if(number >=7)
            (findViewById<ConstraintLayout>(R.id.place7)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place7)).visibility = ConstraintLayout.GONE

        if(number >=8)
            (findViewById<ConstraintLayout>(R.id.place8)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place8)).visibility = ConstraintLayout.GONE

        if(number >=9)
            (findViewById<ConstraintLayout>(R.id.place9)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place9)).visibility = ConstraintLayout.GONE

        if(number >=10)
            (findViewById<ConstraintLayout>(R.id.place10)).setOnClickListener {
                // your code to perform when the user clicks on the button
                val mIntent = Intent(this, DomoticaItemsControl1::class.java)
                startActivity(mIntent)
            }
        else (findViewById<ConstraintLayout>(R.id.place10)).visibility = ConstraintLayout.GONE
    }
}
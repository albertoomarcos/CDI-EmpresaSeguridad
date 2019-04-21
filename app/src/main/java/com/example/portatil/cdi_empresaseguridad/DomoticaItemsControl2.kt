package com.example.portatil.cdi_empresaseguridad

import android.graphics.Color
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DomoticaItemsControl2: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_controls)

        onOff()
        upDown()
    }

    fun onOff() {

        val colorActivate = Color.parseColor("#00BCD4")
        val colorDeactivate = Color.parseColor("#817F7F")

        val imageActivate = ContextCompat.getDrawable(this, R.drawable.b_on)
        val imageDeactivate = ContextCompat.getDrawable(this, R.drawable.b_off)


        findViewById<ConstraintLayout>(R.id.item1).visibility = ConstraintLayout.GONE

        findViewById<ConstraintLayout>(R.id.item2).visibility = ConstraintLayout.GONE

        val item3 = findViewById<ConstraintLayout>(R.id.item3)
        val on3 = findViewById<ImageView>(R.id.on3)
        item3.setBackgroundColor(colorActivate)
        on3.setImageDrawable(imageActivate)
        on3.setOnClickListener {
            if((it as ImageView).drawable == imageActivate) {
                item3.setBackgroundColor(colorDeactivate)
                it.setImageDrawable(imageDeactivate)
            } else {
                item3.setBackgroundColor(colorActivate)
                it.setImageDrawable(imageActivate)
            }
        }

        findViewById<ConstraintLayout>(R.id.item4).visibility = ConstraintLayout.GONE

    }

    fun upDown() {

        val temp1 = findViewById<TextView>(R.id.temp1)
        val up1 = findViewById<ImageView>(R.id.up1)
        val down1 = findViewById<ImageView>(R.id.down1)
        up1.setOnClickListener {
            temp1.text = temp1.text.toString().toIntOrNull()?.plus(1)?.toString() ?: "20"
        }
        down1.setOnClickListener {
            temp1.text = temp1.text.toString().toIntOrNull()?.minus(1)?.toString() ?: "20"
        }

        val temp2 = findViewById<TextView>(R.id.temp2)
        val up2 = findViewById<ImageView>(R.id.up2)
        val down2 = findViewById<ImageView>(R.id.down2)
        up2.setOnClickListener {
            temp2.text = temp2.text.toString().toIntOrNull()?.plus(1)?.toString() ?: "20"
        }
        down2.setOnClickListener {
            temp2.text = temp2.text.toString().toIntOrNull()?.minus(1)?.toString() ?: "20"
        }
    }
}
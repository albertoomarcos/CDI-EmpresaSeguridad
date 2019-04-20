package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class DomoticaFinal: AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var descripcion: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domotica_fin)

        val imAniadir = findViewById<ImageView>(R.id.imAniadir)

        name = findViewById(R.id.editNombre)
        name.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                imAniadir.isEnabled = (!s.isNullOrBlank() && !descripcion.text.isNullOrBlank())
            }
        })

        descripcion = findViewById(R.id.editDescripcion)
        descripcion.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                imAniadir.isEnabled = (!s.isNullOrBlank() && !descripcion.text.isNullOrBlank())
            }
        })
        imAniadir.isEnabled = false
        imAniadir.setOnClickListener {
            Toast.makeText(this@DomoticaFinal, "Añadido con exito...", Toast.LENGTH_LONG).show()
            val mIntent = Intent(this, DomoticaNuevaPlanta::class.java)
            startActivity(mIntent)
        }

    }
}
package com.olvin.appdesinagerdeactualizaciondelcovid_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contagiadosboton.setOnClickListener {botonpresionado(dato =  "Total contagiados a nivel nacional: 45,896") }
        desesos.setOnClickListener {botonpresionado(dato =  "Total desesos a nivel nacional: 2456") }
        recuperados.setOnClickListener {botonpresionado(dato =  "Total recuperados a nivel nacional: 17,855") }
        activos.setOnClickListener {botonpresionado(dato =  "Total activos a nivel nacional: 45626") }
        limpiar.setOnClickListener {
            resultadotextview.text = " "
        }
    }
    private fun botonpresionado(dato: String){
        resultadotextview.text = dato
    }
}
package com.example.usrgam.ejemplo

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_actividad_tres.*
import kotlinx.android.synthetic.main.content_actividad_tres.*

class actividadTres : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_tres)
        setSupportActionBar(toolbar)


        val valorACompartir = intent.getStringExtra(Intent.EXTRA_TEXT)
        //log.i("etiqueta", "valorACompartir: $(valorACompartir)")

        text_View_compartir.text =valorACompartir

        button_tres.setOnClickListener { view ->
            irAActividadTres()
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun irAActividadTres() {
        val intent = Intent(this, androidEjemplo::class.java)
        startActivity(intent)
    }

}

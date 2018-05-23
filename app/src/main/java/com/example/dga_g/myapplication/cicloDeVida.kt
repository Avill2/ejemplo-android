package com.example.dga_g.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log

import kotlinx.android.synthetic.main.activity_ciclo_de_vida.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_ciclo_de_vida.*
import kotlin.math.log

class cicloDeVida : AppCompatActivity() {
    var contador=0
    var usuario =UusuarioPacerlable("andrea", )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_de_vida)
        setSupportActionBar(toolbar)
        Log.i("ciclo-vida", "ejecuto:On create")


        val contadorGuardado: Int? = savedInstanceState?.get("contador") as Int

        Log.i("ciclo-vida","El contador es: $contadorGuardado")

        if(contadorGuardado !=null){
            text_view_contador.text = contador.toString()
        } else {
            text_view_contador.text = contadorGuardado.toString()
        }


        button_contador
                .setOnClickListener { view ->
                    contador++
                    text_view_contador.text = contador.toString()
                }
    }



    override fun onStart() {
        super.onStart()
        Log.i("create", "Se esta starteando la actividad")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.i("create", "Se esta restorando la instancia de la actividad")
        texto_central.text = savedInstanceState?.getString("GAME_STATE_KEY")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putInt("contador",contador)

        Log.i("ciclo-vida", "Ejecuto: On SaveInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.i("create", "Resumiendo, iniciando recursos como la camara por ejemplo")
    }

    override fun onPause() {
        super.onPause()
        Log.i("create", "Pausando, momento para liberar la memoria y recursos")
    }



    override fun onStop() {
        super.onStop()
        Log.i("create", "Se esta parando la actividad aqui se debe de liberar todos los recursos de interfaz, tambien es un buen lugar para almacenar informacion no volatil")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.i("create", "Va a destruirse la vista, adios a todos")
    }

    override fun finish() {
        super.finish()
        Log.i("create", "Finalizando, El usuario dijo que se quiere ir de esta Actividad")
    }




}

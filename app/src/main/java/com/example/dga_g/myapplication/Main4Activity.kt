package com.example.dga_g.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main4.*
import java.util.ArrayList

class Main4Activity : AppCompatActivity() {
    var arregloUsuarios: ArrayList<Usuario> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        arregloUsuarios = Factory.Usuarios


        val adaptadorSpinnerUsuario = ArrayAdapter<Usuario>(this, android.R.layout.simple_spinner_item, arregloUsuarios)

        adaptadorSpinnerUsuario.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner_Usuario.adapter = adaptadorSpinnerUsuario


}

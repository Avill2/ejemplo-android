package com.example.usrgam.ejemplo

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_actividad_dos.*

import kotlinx.android.synthetic.main.activity_android_ejemplo.*
import kotlinx.android.synthetic.main.content_android_ejemplo.*
import java.util.jar.Manifest

class androidEjemplo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_ejemplo)
        setSupportActionBar(toolbar)




//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        // nuestro codigo

        button_navegar_activida_dos
                .setOnClickListener { view: View ->
                    irAActividadDos()
                }
        button_eviar_correo.setOnClickListener{view: View ->
            irAActividadDos()

        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_android_ejemplo, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun irAActividadDos() {
        val intent = Intent(this, actividadDos::class.java)
        intent.putExtra("nombre", "andrea villacis")
        startActivity(intent)
    }
}

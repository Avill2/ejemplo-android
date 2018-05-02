package com.example.usrgam.ejemplo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_actividad_dos.*
import kotlinx.android.synthetic.main.content_android_ejemplo.view.*

class actividadDos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_dos)
        val nombre=intent.getStringArrayExtra("nombre")
        text_view_nombre.text= nombre.toString()

        button_dos.setOnClickListener { view ->
            irAActividadTres()

        }
        button_eviar_correo.setOnClickListener { view ->
            enviarCorreo()

        }

        button_contacto.setOnClickListener { view ->
            irAActividadTres()

        }


    }
    fun enviarCorreo(){
        val addressees = arrayOf("direccion@unpo.com","direccion@dos.com")
        val intent = Intent(Intent.ACTION_SEND)
        intent.type="text/html"
        intent.putExtra(Intent.EXTRA_EMAIL,addressees)
        intent.putExtra(Intent.EXTRA_SUBJECT,"sujeto")
        intent.putExtra(Intent.EXTRA_TEXT,"texto")
    }

    fun irAActividadTres() {
        val intent = Intent(this, actividadTres::class.java)
        startActivity(intent)
    }

    fun seleccionarContacto(){
        val intent = Intent(Intent.ACTION_PICK,ContactsContract.CommonDataKinds.Phone.CONTENT_URI)
        startActivityForResult(intent, RESPUESTA_DE_CONTACTO)
    }

    companion object {
        val RESPUESTA_DE_CONTACTO =1;

    }


}


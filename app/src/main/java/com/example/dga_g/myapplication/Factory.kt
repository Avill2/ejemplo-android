package com.example.dga_g.myapplication

import java.util.ArrayList

class FACTORY {
    companion object {
        var Usuarios:ArrayList<Usuario> = ArrayList()
        init {
            Usuarios.add(Usuario("andrea","villacis","cafe"))
            Usuarios.add(Usuario("alejandra","alcivar","negro"))
            Usuarios.add(Usuario("jared","nuñez","azul"))

        }

    }
}
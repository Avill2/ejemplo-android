package com.example.dga_g.myapplication

//en la parte de arriba se pone el constructor
class Usuario (var nombre:String, var apellido:String,var colorFavorito:String){

    //es para q se pueda mostrar lo que nosotros queremos
    override fun toString(): String{
        return "$nombre $apellido"
    }
}
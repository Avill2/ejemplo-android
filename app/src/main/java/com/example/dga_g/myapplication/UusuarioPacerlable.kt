package com.example.dga_g.myapplication

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class UusuarioPacerlable(val nombre: String,
              val edad: Int,
              val fechaNacimiento: Date?,
              val casado: Boolean) : Parcelable {

//el csntrutuctor se lee tipo parsel
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readDate(),
            parcel.readByte() != 0.toByte()) {
    }

    override fun describeContents(): Int {
        return 0
    }

//esrbir en cada una de nuestras variables
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(nombre)
        dest?.writeInt(edad)
        dest?.writeDate(fechaNacimiento)
        dest?.writeByte((if (casado) 1 else 0).toByte())
    }

    companion object CREATOR : Parcelable.Creator<Usuario> {
        override fun createFromParcel(parcel: Parcel): Usuario {
            return Usuario(parcel)
        }


        override fun newArray(size: Int): Array<Usuario?> {
            return arrayOfNulls(size)
        }
    }
}

fun Parcel.writeDate(date: Date?) {
    writeLong(date?.time ?: -1)
}

fun Parcel.readDate(): Date? {
    val long = readLong()
    return if (long != -1L) Date(long) else null
}
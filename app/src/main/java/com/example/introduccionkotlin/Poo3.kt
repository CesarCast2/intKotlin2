package com.example.introduccionkotlin

fun interface ITrabajadorSAM{ //SAM single abstraction method
    fun cobrarNomina()
}

interface ITrabajador{
fun cobrarNomina()
}

open class Persona{
    var nombre: String = ""
    fun ImprimirDetalles(){
        println("El nombre es $nombre")
    }
}
class Empleado : Persona(){
    var clave:String = ""
    fun datosTrabajador(){
        println("Su clave es $clave")
    }
}
fun main(){
    val trabajador = object : ITrabajador {
        override fun cobrarNomina() {
            println("Cobrando feria")

        }
    }
    val trabajador2 = ITrabajadorSAM {
        println("Cobrando")
    }
    val empleado = Empleado()
    empleado.clave = "001"
    empleado.nombre = "Cesar Castañeda"
    empleado.ImprimirDetalles()
    println("---------------")
    trabajador2.cobrarNomina()
}
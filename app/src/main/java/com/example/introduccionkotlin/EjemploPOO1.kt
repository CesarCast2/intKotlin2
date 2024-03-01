package com.example.introduccionkotlin

class Alumno(var nombre: String, numeroControl:String){
    private val numeroControl:String

    init{
        this.numeroControl = numeroControl
    }

    constructor(nombre:String): this(nombre, "210111950")

    fun detalles(nombre:String){
        this.nombre = "Otro-$nombre"
        detalles()
    }

    fun detalles(){
        val cadena = """Es un perfil de alumno
            |$nombre
            |numero de control $numeroControl
        """.trimMargin()
        println(cadena)
    }

}
fun main(){
    println("POO 1")
    val alumno = Alumno("Cesar Castañeda Gomez", "210111950")
    alumno.detalles()
    val alumno2 = Alumno("Carlos Almada", "0909123")
    alumno2.detalles()
}
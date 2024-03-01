package com.example.introduccionkotlin

fun main(){
    /**
     * Comentario de documentacion
     */
    println("Hola Mundo") //punto y coma opcional
    print("Hay tu marido belcas") //No salta linea
    println("<-- continuo ")

    //variables
    var x = 10 // int x
    var y:Int = 20 // y es un entero
    var nombre:String //Esta es una cadena
    nombre = "Cesar Castañeda"
    val grupo = "6U"
    println(nombre)
    println("Este es el valor de x " +x)
    println("El valor de y es $y")//String template
    var nombreCompleto = """
        Datos personales
        Este es mi nombre $nombre
        y soy del grupo $grupo
        """.trimMargin()
            println(nombreCompleto)
    print("Dame un nombre: ")
    nombre = readLine()!!
    print("Dame la edad:")
    y = readLine()!!.toInt()
    println("Mi nombre es $nombre y la edad es $y")
}
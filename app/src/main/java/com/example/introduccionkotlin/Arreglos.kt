package com.example.introduccionkotlin

/**
 * Metodo para crear arreglos
 */
fun main(){
    var notas = arrayOf(10, 8, 6, 10, 8)
    println("La segunda nota es ${notas[1]}")
    notas[3] =7
    println("Los valores del arreglo son: ")
    for (nota in notas){
        println("El valor es $nota")
    }
    notas += 10
    println(notas.joinToString())
    val suma = notas.sum()
    val promedio = notas.average()
    println("La suma de las calificaciones son $suma")
    println("El promedio de las calificaciones son $promedio")
    println("El doble de las calificaciones")
    notas.forEach {
        println("El valor de $it a lo doble es ${it * 2}")
    }                                //lamdas
    var arregloPares = Array(5){i -> i * 2}
    var arregloNombre = Array(10) {"No definido"}
    println(arregloPares.joinToString())
    println(arregloNombre.joinToString())
    /////
    var arreglo = emptyArray<String>()
    arreglo += "Juan"
    arreglo[0] = "pepe"
}
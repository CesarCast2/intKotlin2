package com.example.introduccionkotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val calificaciones = mutableListOf<Double>()

    for (i in 1..10) {
        print("Ingrese la calificación $i: ")
        val calificacion = scanner.nextDouble()
        calificaciones.add(calificacion)
    }

    val promedio = average(calificaciones)
    println("El promedio de las calificaciones es: $promedio")
}

fun average(calificaciones: List<Double>): Double {
    var total = 0.0
    for (calificacion in calificaciones) {
        total += calificacion
    }
    return total / calificaciones.size
}

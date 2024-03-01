package com.example.introduccionkotlin

/**
 * Cesar Castañeda Gomez
 * 06 de febrero del 24
 */
fun main() {
    // Solicitar al usuario la base del triángulo
    println("Ingrese la base del triángulo:")
    val base = readLine()?.toDoubleOrNull()

    // Verificar si la entrada para la base es válida
    if (base == null || base <= 0) {
        println("Entrada inválida para la base del triángulo.")
        return
    }

    // Solicitar al usuario la altura del triángulo
    println("Ingrese la altura del triángulo:")
    val altura = readLine()?.toDoubleOrNull()

    // Verificar si la entrada para la altura es válida
    if (altura == null || altura <= 0) {
        println("Entrada inválida para la altura del triángulo.")
        return
    }

    // Calcular el área del triángulo
    val area = (base * altura) / 2

    // Mostrar el área del triángulo
    println("El área del triángulo con base $base y altura $altura es: $area")
}

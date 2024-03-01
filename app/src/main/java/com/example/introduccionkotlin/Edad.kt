package com.example.introduccionkotlin

fun main() {
    println("Por favor, ingresa tu edad:")
    val edad = readLine()?.toIntOrNull()

    if (edad != null) {
        if (edad >= 18) {
            println("Eres mayor de edad.")
        } else {
            println("Eres menor de edad.")
        }
    } else {
        println("Edad inválida. Por favor, ingresa un número válido.")
    }
}

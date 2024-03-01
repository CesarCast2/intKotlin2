package com.example.introduccionkotlin

fun main() {
    // Iteramos del 1 al 10 para las tablas de multiplicar
    for (i in 1..10) {
        println("Tabla del $i:")
        // Iteramos del 1 al 10 para los multiplicadores
        for (j in 1..10) {
            // Calculamos el resultado de la multiplicación
            val resultado = i * j
            // Imprimimos la multiplicación en formato "multiplicando x multiplicador = resultado"
            println("$i x $j = $resultado")
        }
        println() // Imprimimos una línea en blanco para separar las tablas
    }
}
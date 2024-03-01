package com.example.introduccionkotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val nombres = mutableListOf<String>()

    var opcion: Int

    do {
        println("Menú:")
        println("1) Agregar")
        println("2) Mostrar")
        println("3) Salir")
        print("Seleccione una opción: ")
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                print("Ingrese un nombre: ")
                val nombre = readLine()!!.trim()
                nombres.add(nombre)
            }
            2 -> println("Cantidad de nombres almacenados: ${nombres.size}")
            3 -> println("Saliendo...")
            else -> println("Opción inválida")
        }
    } while (opcion != 3)
}

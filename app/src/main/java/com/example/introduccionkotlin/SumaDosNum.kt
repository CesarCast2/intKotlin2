package com.example.introduccionkotlin

/**
 * Cesar Castañeda Gomez
 * Introduccion a kotlin
 * 06 de febrero del 2024
 */
fun main(){
    //Ingresar el primer numero
    println("Ingresa el primer numero:")
    val num1 = readLine()?.toDoubleOrNull()

    //Verificar si el primer numero es valido
    if(num1==null){
       println("Entrada no valida para el primer numero.")
        return
    }
    //ingresar el segundo numero
    println("Ingrese el segundo numero:")
    val num2 = readLine()?.toDoubleOrNull()
    if(num2==null){
        println("Entrada no valida para el segundo numero.")
        return
    }
    //Se calculan los dos numeros sumados
    val suma = num1+num2
    //Mostrar la suma de los dos numeros
    println("La suma de $num1 y $num2 es: $suma")
}
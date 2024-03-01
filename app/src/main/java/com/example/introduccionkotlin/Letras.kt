package com.example.introduccionkotlin

fun main(){
    println("Dame una calificacion en letra: ")
    val letter = readln()

    val grado = when(letter.uppercase()){
        "A" -> 10
        "B" -> 9
        "C" -> 8
        "D" -> 7
        "E" -> 6
        else -> -1
    }
    println("${if(grado<0) "Invalido" else grado}")
}
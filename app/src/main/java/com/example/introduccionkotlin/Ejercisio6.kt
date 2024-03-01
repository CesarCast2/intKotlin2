package com.example.introduccionkotlin

fun main(){
    println("Dame una hora: ")
    val result = when (val hour = readLine()!!.toInt()){
        in 1.. 11 -> "$hour AM"
        0 -> "12 AM"
        12 -> "12 AM"
        in 13 .. 23 -> "${hour-12} PM"
        else -> "invalido"
    }
    println(result)
}
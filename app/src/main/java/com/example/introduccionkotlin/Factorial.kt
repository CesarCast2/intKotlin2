package com.example.introduccionkotlin

fun main(){
    println("Dame un numero:")
    val num = readLine()!!.toInt()
    var factorial = 1
    for (i in 1 .. num)
        factorial *=i
    println("El factorial del numero es $factorial")
}
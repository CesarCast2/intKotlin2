package com.example.introduccionkotlin

fun main(){
    var valor = -1
    while(valor !=0){
        println("Dame un numero:")
        valor = readLine()!!.toInt()
    }
}
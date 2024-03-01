package com.example.introduccionkotlin

fun main(){
    var tabla = 3
    var i=0
    while (i<=10){
        println("$tabla x $i = ${tabla*i}")
        i++
    }
    println("------------")
    for (i in 0..10 step 2){
        println("$tabla x $i = ${tabla*i}")
    }
    println("------------")
    for (i in 10 downTo  1 step 2){
        println("$tabla x $i = ${tabla*i}")
    }
}
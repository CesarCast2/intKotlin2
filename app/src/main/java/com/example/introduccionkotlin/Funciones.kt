package com.example.introduccionkotlin

fun hacerSuma(n1:Int, n2:Int):Int{
    val res = n1+n2
    return res
}
fun hacerResta(n1:Int, n2: Int) = n1-n2

fun main(){
    var num1:Int
    var num2:Int
    var res:Int
    println("Dame un numero")
    num1 = readLine()!!.toInt()
    println("Dame un segundo numero")
    num2 = readLine()!!.toInt()
    println("El resultado es ${hacerSuma(num1, num2)}")
    println("La resta es ${hacerResta(num1, num2)}")
}
package com.example.introduccionkotlin

/**
 * Cesar Castañeda Gomez
 * 06 de febrero del 24
 */
fun main(){
    //Definir tipo de cambio de pesos a dolares
    val tipoCambio = 20.95
//Ingresar la cantidad en pesos
    println("Ingrese la cantidad en pesos mi pa:")
    val cantidadPesos = readLine()?.toDoubleOrNull()
    //Verificar si la cantidad en pesos es valida
    if(cantidadPesos==null || cantidadPesos <0){
        println("La entrada en pesos es invalida")
        return
    }
    //Calcular el equivalente a dolares
    val cantidadDolares = cantidadPesos/tipoCambio

    //mostrar el equivalente en dolares
    println("El equivalente de $cantidadPesos pesos es: \\\$${"%.2f".format(cantidadDolares)}")
}
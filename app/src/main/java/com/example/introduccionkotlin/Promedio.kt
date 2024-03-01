package com.example.introduccionkotlin

/**
 * Cesar Castañeda Gomez
 * 06 de febrero del 24
 */
fun main(){
    //Arreglo para almacenar las calificaciones
    val cal = DoubleArray(5)
    //Ingresar las calificaciones
    for (i in 0 until 5){
        println("ingrese la calificacion ${i+1}:")
        val calificacion = readLine()?.toDoubleOrNull()

        //Verificar la entrada si es valida
        if (calificacion==null || calificacion <0 || calificacion <10){
            println("Entrada invalida de la calificacion.")
            return
        }
        //Almacenar la calificacion en el arreglo
        cal [i] = calificacion
    }
    //calcular el promedio
    val promedio = cal.average()
    //mostrar promedio
    println("El promedio de las calificaciones es: $promedio")
}
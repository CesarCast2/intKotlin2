package com.example.introduccionkotlin

/**
 * Cesar Castañeda
 * 06 febrero del 24
 */
fun main(){
    //Solicitar el numero de partidos ganados
    println("Ingrese el numero de partidos ganados:")
    val partidosGanados = readLine()?.toIntOrNull()
    //Verificar si la entrada de los partidos es valida
    if(partidosGanados == null || partidosGanados <0){
    println("Entrada invalida para los partidos ganados")
        return
    }
    //Solicitar el numero de partidos empatados
    println("Ingrese el numero de partidos empatados:")
    val partidosEmpatados = readLine()?.toIntOrNull()
    if(partidosEmpatados == null || partidosEmpatados <0){
        println("Entrada invalida para los partidos empatados")
        return
    }
    //Calcular puntaje
    val puntaje = (partidosGanados*3)+partidosEmpatados
    //Calcular el numero total de partidos
    val totalPartidos = partidosGanados + partidosEmpatados

    //mostrar el numero total de los partidos y puntaje del equipo
    println("El equipo ha jugado un total de $totalPartidos partidos.")
    println("El equipo ha jugado un total de $puntaje puntos.")
}
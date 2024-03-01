package com.example.introduccionkotlin

fun main(){
    var hora: Int
    var horaReal = ""
    println("Dame una hora: ")
    hora = readLine()!!.toInt()
    if (hora==0){
        horaReal = "12:00 AM"
    }else if(hora<12){
        horaReal= "$hora:00 AM"
    }else if (hora ==12)
        horaReal="12:00 PM"
    else if (hora<23)
        horaReal = "${hora-12}:00 PM"
    else
        horaReal = "Invalido"
    println("La hora es $horaReal")
}
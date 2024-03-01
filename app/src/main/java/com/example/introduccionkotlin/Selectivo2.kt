package com.example.introduccionkotlin
fun medicionCalificacion(calificacion:Int) =
when(calificacion){
    in 0.. 50 -> "No pasaste por wey"
    in 51.. 60 -> "Casi, pero no" 69 -> "Ya casi mi pa"
    in 70 .. 100 -> "Si acredistaste siiiuuuuuuuu"
    else -> "No estudiaste pinche huevon"
}
fun main(){
    var marca = ""
    println("Dame una Marca: ")
    marca = readLine()!!
    when(marca){
        "Gymshark", "YoungLa", "Lamborguini" -> println("Buena marca")
        else -> println("No la conzco")
    }
    println("${medicionCalificacion(80)}")
}
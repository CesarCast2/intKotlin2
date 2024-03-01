package com.example.introduccionkotlin

class Equipo(var serie:String = "No DEF", var nombre:String){
    fun print(){
        println("""El equipo $nombre con
            |numero de serie $serie""".trimMargin())
    }
}
fun main(){
    val equipo = Equipo(nombre = "Huawei")
    equipo.print()
}
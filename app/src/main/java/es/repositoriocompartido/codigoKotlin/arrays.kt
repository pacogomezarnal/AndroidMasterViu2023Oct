package es.repositoriocompartido.codigoKotlin

fun main(){

    //Primera forma creacion arrays
    val nombres = arrayOf("Paco","Pancho","Pepe")
    println(nombres[1])
    //Otras mecanismos
    val initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString())

    //Array multidimensional
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }

}
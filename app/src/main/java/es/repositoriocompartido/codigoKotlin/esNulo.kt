package es.repositoriocompartido.codigoKotlin

fun main(){
    var nombre:String? = "Paco"
    var apellidos:String = "Gomez"
    nombre=null //No compila

    println(nombre) //No va a dar ningún error

    println(apellidos.length) //Error de compilación
    println(nombre?.length) //No da error de compilacion
}
package es.repositoriocompartido.codigoKotlin

fun main(){

    //TIPOS NUMERICOS
    val uno=1
    val edad:Int=48    //Int
    //edad=45 ERROR
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    var altura:Float = 1.75f
    altura=1.76f

    //DECIMALES
    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    //CARACT Y STRING
    val aChar: Char = 'a'
    val str = "Esto es una frase completa" //Automáticamente se detecta que es un string
    val str2:String = "Esto es una frase completa" //ES UNA BUENA PRÁCTICA

    //Boolean
    val estoySpain = true
    val soyHombre:Boolean = true

    println(uno)
}
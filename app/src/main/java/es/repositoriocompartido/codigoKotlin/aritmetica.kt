package es.repositoriocompartido.codigoKotlin

fun main(){
    //Creacion de variables
    var edad:Int =40
    var intervalo:Int=2
    val paso:Float = 2.5f
    val numeroPieTxt:String = "44"

    //Operaciones aritmeticas
    println(edad+intervalo)
    println(edad*intervalo)
    println(edad/intervalo)
    println(edad%intervalo)

    //Conversiones
    val edadSumada=edad+paso
    val numeroPie:Int=numeroPieTxt.toInt()
    println(edadSumada)
    println(edad+paso.toInt())

}
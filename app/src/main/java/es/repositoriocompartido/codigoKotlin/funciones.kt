package es.repositoriocompartido.codigoKotlin

fun main(){
    var frutas:Array<String> = arrayOf("Pera","Manzana","Sandia")
    println(double(6))
    println(sumaPonDef(2,4))
}

//Definicion
fun double(x: Int): Int {
    return 2 * x
}
fun doubleS(x:Int) :Int = x*2

//Modificacion de array
fun cambiaFruta(frutas:Array<String>){
    frutas[0]="Melón"
}

//Paso parametros por defecto
//Suma ponderada de dos parámetros con valor por defecto
fun sumaPonDef(x: Int,y:Int=0): Int {
    return (2 * x)+y
}
package es.repositoriocompartido.codigoKotlin

class PlanetaVacio //Clase totalmente vacáa

class Planeta(val nombre:String,val diametro:Int){ //CONSTRUCTOR PRIMARIO - Propiedades read-only

    constructor(nombre: String,diametro: Int,esGaseoso:Boolean):this(nombre,diametro) //Segundo constructor
    constructor(nombre:String,diametro:Int,esGaseoso:Boolean,tieneVida:Boolean):this(nombre,diametro) //Tercer constructor

    init{
        println("El planeta $nombre tiene un diametro de $diametro")
    }

}
fun main(){

    println("Cargando Sistema Solar ...")
    //Primer planeta
    val planetaDesconocido = PlanetaVacio()

    //Planeta Tierra
    val tierra:Planeta =Planeta("Tierra",12742)
    val jupiter:Planeta =Planeta("Jupiter",12742,true)
    //tierra.nombre ="tierra"
    println("El nuevo planeta con nombre ${tierra.nombre} con un diametro de ${tierra.diametro} ")
    println("El nuevo planeta con nombre ${tierra.nombre} con un diametro de ${tierra.diametro} ")

}
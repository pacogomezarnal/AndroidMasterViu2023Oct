package es.repositoriocompartido.codigoKotlin

fun main() {
    ifMultipleOR()
}

//If básico con lógica múltiples
fun ifMultipleOR(){
    var pet = "cat"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)){
        print("Es un gato o un perro")
    }
}

//Otro de if básico con lógica múltiples
fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
        println("Puedo beber cerveza")
    }

}

//Ejemplo If Else
fun ifInt(){
    var age = 18

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

//Ejemplo Boolean
fun ifBoolean(){
    var soyFeliz:Boolean = false

    //sin nada == true
    // con ! al principio == false

    if(!soyFeliz){
        print("Estoy triste :(")
    }
}

//Ejemplo If completo
fun ifAnidado() {
    val animal = "perro"

    if (animal == "perro") {
        println("Es un perrito!")
    } else if (animal == "gato") {
        println("Es un gato")
    } else if (animal == "pajaro") {
        println("Es un pajaro")
    } else {
        println("No es uno de los animales esperados")
    }


}

//Ejemplo If basico
fun ifBasico() {
    val nombre = "Maria"

    if (nombre == "Maria") {
        println("El nombre es Maria")
    } else {
        println("Esta no es MAria")
    }
}
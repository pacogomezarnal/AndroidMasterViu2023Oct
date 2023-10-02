package es.repositoriocompartido.codigoKotlin

fun main(){

    getMes(9)
}

//Resultado conocer el tipo de variable
fun result(value:Any){
    when(value){
        is Int -> value*2
        is String -> value+" "+value
    }
}


//Rangos con when
fun getTrimestre2(mes:Int){
    when(mes){
        in 1..3 -> print("Primer trimestre")
        4,5,6 -> print("Segundo trimestre")
        7,8,9 -> print("Tercer trimestre")
    }
}

//Rangos con when
fun getTrimestre(mes:Int){
    when(mes){
        1,2,3 -> print("Primer trimestre")
        4,5,6 -> print("Segundo trimestre")
        7,8,9 -> print("Tercer trimestre")
    }
}

//When
fun getMes(mes:Int){
    when(mes){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> print("No es un mes válido")
    }
}
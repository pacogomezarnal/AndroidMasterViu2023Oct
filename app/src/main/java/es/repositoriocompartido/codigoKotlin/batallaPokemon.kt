package es.repositoriocompartido.codigoKotlin

enum class TipoPokemon{
    AGUA,ELECTRICO,FUEGO
}

enum class TipoAtaque{
    NORMAL, ELECTRICO, PSIQUICO, AGUA, LUCHA
}

class Ataque(val nombre:String,val tipoAtaque:TipoAtaque,val danyo:Int)

class Pokemon(val nombre:String,val tipo:TipoPokemon,var vida:Int=0,val ataques:Array<Ataque>){

    fun restarVida(danyo:Int=0){
        this.vida=-danyo
    }
    fun pintarAtaques(){
        for(ataque in ataques){
            //Imprimir nombre -> número
        }
    }
}

fun main(){
        var turnoPikachu =true
        var ataqueElegido:String=""
        var ataqueIa:Int=0

        //Creamos los ataques
        val ataquesSquirtle= arrayOf(Ataque("Sorpresa",TipoAtaque.NORMAL,30),
            Ataque("Demolicion",TipoAtaque.LUCHA,10),
            Ataque("Buceo",TipoAtaque.AGUA,20),
            )

        val ataquesPikachu= arrayOf(Ataque("Látigo",TipoAtaque.NORMAL,30),
            Ataque("BolaVoltio",TipoAtaque.ELECTRICO,20),
            Ataque("Agilidad",TipoAtaque.PSIQUICO,30),
        )

        //Creamos Pokemos Pikachu
        val pikachu = Pokemon("Pikachu",TipoPokemon.ELECTRICO,100,ataquesPikachu)
        val squirtle = Pokemon("Squirtle",TipoPokemon.AGUA,100,ataquesSquirtle)

        //COMENZAMOS LA PARTIDA
        println("======== COMIENZA LA BATALLA ENTRE ${pikachu.nombre.uppercase()} Y ${squirtle.nombre.uppercase()} ======== COMIENZA LA BATALLA ENTRE ")

    while((pikachu.vida>0) && (squirtle.vida>0) ){
        if(turnoPikachu){
            println("### ATAQUE PIKACHU")
            print("### ELIJE UN ATAQUE->")
            pikachu.pintarAtaques()
            ataqueElegido= readln()
            when(ataqueElegido.toInt()) {
                0 -> squirtle.restarVida(pikachu.ataques[0].danyo)
            }
            //turno pasaria a Squirtle
        }else{
            //ES LA MAQUINA QUIEN ELIGE
            ataqueIa=(0..2).random()
        }

        //MENSAJE DE FINALIZACION
    }

}
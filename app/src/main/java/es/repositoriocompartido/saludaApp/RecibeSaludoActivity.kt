package es.repositoriocompartido.saludaApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import es.repositoriocompartido.androidmasterviu.R

class RecibeSaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibe_saludo)

        //Capturamos el componente de Texto
        val txtResultado=findViewById<TextView>(R.id.txtResultado)

        //Recibimos la informacion
        val texto:String=intent.extras?.getString("texto").orEmpty()
        if(texto.isNotEmpty()) txtResultado.text = texto.uppercase()
    }
}
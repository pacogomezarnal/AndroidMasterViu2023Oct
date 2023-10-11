package es.repositoriocompartido.saludaApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import es.repositoriocompartido.androidmasterviu.R

class SaludaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saluda)

        //Primero recuperar es el boton
        val btnPulsar = findViewById<Button>(R.id.btnPulsar)
        btnPulsar.setOnClickListener {
            Log.i("RepositorioCompartido","------ BOTON ${btnPulsar.id} PULSADO ------")
        }
    }
}
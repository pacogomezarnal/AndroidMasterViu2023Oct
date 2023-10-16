package es.repositoriocompartido.imcMejorado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import es.repositoriocompartido.androidmasterviu.R

class ResultImcMejoradoActivity : AppCompatActivity() {

    lateinit var btnReCalculate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc_mejorado)

        //Inicializar el boton
        btnReCalculate =findViewById(R.id.btnReCalculate)

        btnReCalculate.setOnClickListener { onBackPressed() } // Activity dentro de la pila, el anterior
    }
}
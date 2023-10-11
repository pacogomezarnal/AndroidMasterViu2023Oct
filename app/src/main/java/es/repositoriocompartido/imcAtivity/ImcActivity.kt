package es.repositoriocompartido.imcAtivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import es.repositoriocompartido.androidmasterviu.R

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        //Capturar boton, editTxts, txtResultado
        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        //Listener sobre el boton
        btnCalcular.setOnClickListener {
            //Calculos del IMC
            val pesoNum:Float?=edtPeso.text.toString().toFloatOrNull()
            val alturaNum:Float?=edtAltura.text.toString().toFloatOrNull()
            if(pesoNum!=null && alturaNum!=null) {
                val imc = pesoNum / (alturaNum * alturaNum)
                //Devolucion por el TextView
                txtResult.text = imc.toString()
            }else{
                txtResult.text = " ME ESTAS VACILANDO BRO? REVISA LOS DATOS"
            }
        }

    }
}
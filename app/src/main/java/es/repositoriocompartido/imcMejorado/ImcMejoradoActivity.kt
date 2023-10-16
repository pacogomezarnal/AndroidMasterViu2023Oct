package es.repositoriocompartido.imcMejorado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import es.repositoriocompartido.androidmasterviu.R

class ImcMejoradoActivity : AppCompatActivity(){

    //Variables de calculo  o funcionamiento
    private var mujerSeleccionada:Boolean = true
    private var altura:Int = 120
    private var peso:Int = 70

    //Componentes
    private lateinit var cvHombre:CardView
    private lateinit var cvMujer:CardView
    private lateinit var txtAltura: TextView
    private lateinit var rngAltura: RangeSlider
    private lateinit var txtPeso: TextView
    private lateinit var btnMasPeso: FloatingActionButton
    private lateinit var btnMenosPeso: FloatingActionButton
    private lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_mejorado)

        //Funcion de inicializacion de componentes
        initComponentes()
        initListener()

    }

    private fun initComponentes(){
        cvHombre = findViewById(R.id.cvHombre)
        cvMujer = findViewById(R.id.cvMujer)

        txtAltura = findViewById(R.id.txtAltura)
        txtAltura.text = "${altura.toString()} cm"
        rngAltura = findViewById(R.id.rngAltura)

        txtPeso = findViewById(R.id.txtPeso)
        btnMasPeso = findViewById(R.id.btnMasPeso)
        btnMenosPeso = findViewById(R.id.btnMenosPeso)
        txtPeso.text = peso.toString()

        btnCalculate = findViewById(R.id.btnCalculate)

    }

    private fun initListener(){
        //CardView
        cvHombre.setOnClickListener{cambiarColorSexo(false)}
        cvMujer.setOnClickListener{cambiarColorSexo(true)}

        //Listener de altura
        rngAltura.addOnChangeListener { slider, value, fromUser ->
            altura = value.toInt()
            txtAltura.text = "${altura.toString()} cm"
        }

        //Listener de Peso
        btnMasPeso.setOnClickListener {
            if(peso<120) peso += 1
            setPeso()
        }
        btnMenosPeso.setOnClickListener {
            if(peso>30) peso -= 1
            setPeso()
        }

        //Calculo del IMC
        btnCalculate.setOnClickListener{
            val imc:Double = calcularIMC()
            val intent = Intent(this,ResultImcMejoradoActivity::class.java)
            intent.putExtra("IMC",imc)
            startActivity(intent)
        }
    }

    private fun setPeso() {
        txtPeso.text = peso.toString()
    }

    fun cambiarColorSexo(esMujer:Boolean){
        if(esMujer){
            cvMujer.setCardBackgroundColor(ContextCompat.getColor(this,R.color.imcM_card_selected))
            cvHombre.setCardBackgroundColor(ContextCompat.getColor(this,R.color.imcM_card_noselected))
            mujerSeleccionada = true
        }else{
            cvMujer.setCardBackgroundColor(ContextCompat.getColor(this,R.color.imcM_card_noselected))
            cvHombre.setCardBackgroundColor(ContextCompat.getColor(this,R.color.imcM_card_selected))
            mujerSeleccionada = false
        }
    }

    private fun calcularIMC():Double{
        val pesoDoble:Double=peso.toDouble()
        val alturaDoble:Double = (altura.toDouble())/100
        return pesoDoble / (alturaDoble*alturaDoble)
    }
}
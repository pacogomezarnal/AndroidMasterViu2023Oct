package es.repositoriocompartido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import es.repositoriocompartido.androidmasterviu.R
import es.repositoriocompartido.canalesyoutube.CanalesYoutubeActivity
import es.repositoriocompartido.imcAtivity.ImcActivity
import es.repositoriocompartido.imcMejorado.ImcMejoradoActivity
import es.repositoriocompartido.saludaApp.SaludaActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Capturamos botones y lanzamos
        val btnImc= findViewById<Button>(R.id.btnImcApp)
        val btnSaluda= findViewById<Button>(R.id.btnSaluda)
        val btnImcMejorado= findViewById<Button>(R.id.btnIMcAppMejorada)
        val btnCanales= findViewById<Button>(R.id.btnCanales)


        //Eventos
        btnImc.setOnClickListener {
            Log.i("MENU --------- ","LANZAMOS APP IMC")
            navegarHaciaApp(ImcActivity::class.java)
        }
        btnSaluda.setOnClickListener {
            Log.i("MENU --------- ","LANZAMOS SALUDA APP")
            navegarHaciaApp(SaludaActivity::class.java)
        }
        btnImcMejorado.setOnClickListener {
            Log.i("MENU --------- ","LANZAMOS IMC MEJORADO")
            navegarHaciaApp(ImcMejoradoActivity::class.java)
        }
        btnCanales.setOnClickListener {
            Log.i("MENU --------- ","LANZAMOS CANALES APP")
            navegarHaciaApp(CanalesYoutubeActivity::class.java)
        }
    }

    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }

}
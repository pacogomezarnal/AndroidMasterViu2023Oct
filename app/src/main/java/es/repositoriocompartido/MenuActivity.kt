package es.repositoriocompartido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import es.repositoriocompartido.androidmasterviu.R
import es.repositoriocompartido.imcAtivity.ImcActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Capturamos botones y lanzamos
        val btnImc= findViewById<Button>(R.id.btnImcApp)
        btnImc.setOnClickListener {
            Log.i("MENU --------- ","LANZAMOS APP IMC")
            val intent = Intent(this,ImcActivity::class.java)
            startActivity(intent)
        }
    }
}
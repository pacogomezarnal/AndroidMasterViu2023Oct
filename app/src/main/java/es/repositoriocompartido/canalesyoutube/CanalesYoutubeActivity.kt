package es.repositoriocompartido.canalesyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.repositoriocompartido.androidmasterviu.R

class CanalesYoutubeActivity : AppCompatActivity() {

    //Listado Categorias test
    private val categorias= listOf (
        CategoriasCanales.CINE,
        CategoriasCanales.TECNOLOGIA,
        CategoriasCanales.COCINA,
        CategoriasCanales.OTROS
    )

    private val canales= listOf (
        Canal("Repositorio Compartido",CategoriasCanales.TECNOLOGIA),
        Canal("Cocinando con Arguiñano",CategoriasCanales.COCINA),
        Canal("Cine cartelera",CategoriasCanales.CINE)
    )

    //Recycler categorias
    private lateinit var rvCategorias:RecyclerView
    private lateinit var categoriasAdapter: CategoriasAdapter

    //Recycler canales
    private lateinit var rvCanales:RecyclerView
    private lateinit var ccanalesAdapter: CanalesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canales_youtube)

        initComponent()
        initUI()
    }

    private fun initComponent(){
        rvCategorias = findViewById(R.id.rvCategorias)
        rvCanales = findViewById(R.id.rvCanales)
    }

    private fun initUI(){
        categoriasAdapter = CategoriasAdapter(categorias)
        rvCategorias.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvCategorias.adapter=categoriasAdapter

        ccanalesAdapter = CanalesAdapter(canales)
        rvCanales.layoutManager = LinearLayoutManager(this)
        rvCanales.adapter=ccanalesAdapter
    }
}
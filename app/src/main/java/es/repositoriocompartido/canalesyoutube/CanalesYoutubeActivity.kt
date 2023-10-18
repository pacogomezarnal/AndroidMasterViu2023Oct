package es.repositoriocompartido.canalesyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.repositoriocompartido.androidmasterviu.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CanalesYoutubeActivity : AppCompatActivity() {

    //Listado Categorias test
    private val categorias= listOf (
        CategoriasCanales.CINE,
        CategoriasCanales.TECNOLOGIA,
        CategoriasCanales.COCINA,
        CategoriasCanales.OTROS
    )

    /*
    * Datos fake
    *
    private val canales= listOf (
        Canal("Repositorio Compartido",CategoriasCanales.TECNOLOGIA),
        Canal("Cocinando con Arguiñano",CategoriasCanales.COCINA),
        Canal("Cine cartelera",CategoriasCanales.CINE)
    )*/

    private val canalesInit= mutableListOf<Canal>()
    private val canalesSafe= mutableListOf<Canal>()

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
        //Realizamos la peticion a nuestro API
        getCanales()
    }

    //Inicializacion de Componentes visuales
    private fun initComponent(){
        rvCategorias = findViewById(R.id.rvCategorias)
        rvCanales = findViewById(R.id.rvCanales)
    }


    //Incializacion de RecyclerViews
    private fun initUI(){
        categoriasAdapter = CategoriasAdapter(categorias)
        rvCategorias.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvCategorias.adapter=categoriasAdapter

        ccanalesAdapter = CanalesAdapter(canalesInit)
        rvCanales.layoutManager = LinearLayoutManager(this)
        rvCanales.adapter=ccanalesAdapter
    }

    //Funcion de peticion contra APIResptFul
    private fun getCanalesRetrofit():Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.0.108:3000/data/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    private fun getCanales(){
        CoroutineScope(Dispatchers.IO).launch{
            val peticion = getCanalesRetrofit().create(ApiService::class.java).getCanalesYoutube("data")
            val canalesResponse: CanalResponse? = peticion.body()
            runOnUiThread{
                if(peticion.isSuccessful){
                    Log.i("CANALESYOUTUBE","--------- EXITO")
                    //Relleno los datos desde la respuesta
                    val canalesData=canalesResponse?.canales?:emptyList()
                    //Borro datos del RecyclerView
                    canalesInit.clear()
                    canalesInit.addAll(canalesData)
                    //Repinta RecyclerView
                    ccanalesAdapter.notifyDataSetChanged()
                }else{
                    Log.i("CANALESYOUTUBE","--------- ERROR")
                }
            }
        }
    }

}
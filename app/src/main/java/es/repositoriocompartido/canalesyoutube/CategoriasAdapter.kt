package es.repositoriocompartido.canalesyoutube

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.repositoriocompartido.androidmasterviu.R

class CategoriasAdapter(private val categorias:List<CategoriasCanales>): RecyclerView.Adapter<CategoriasViewHolder>() {

    //Se pinta un elemento o vista dentro del RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categoria,parent,false)
        return CategoriasViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categorias.size
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        holder.render(categorias[position])
    }
}
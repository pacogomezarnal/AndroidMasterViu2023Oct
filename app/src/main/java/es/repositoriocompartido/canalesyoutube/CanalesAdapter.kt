package es.repositoriocompartido.canalesyoutube

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.repositoriocompartido.androidmasterviu.R

class CanalesAdapter (private val canales: List<Canal>):RecyclerView.Adapter<CanalesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CanalesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_canal,parent,false)
        return CanalesViewHolder(view)
    }

    override fun getItemCount() = canales.size

    override fun onBindViewHolder(holder: CanalesViewHolder, position: Int) {
        holder.render(canales[position])
    }
}
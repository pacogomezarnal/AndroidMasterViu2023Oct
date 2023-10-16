package es.repositoriocompartido.canalesyoutube

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.repositoriocompartido.androidmasterviu.R

class CanalesViewHolder(view:View) : RecyclerView.ViewHolder(view){

    private val txtCanal: TextView =view.findViewById(R.id.txtCanal)

    fun render(canal:Canal){
        txtCanal.text = canal.nombre
    }

}
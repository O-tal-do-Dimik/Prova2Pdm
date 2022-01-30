package com.example.prova2pdm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AtorAdapter : RecyclerView.Adapter<AtorViewHolder>(){
    var ators: List<Ator> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AtorViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.ator_inflater, parent, false)
        return AtorViewHolder(v)
    }

    override fun onBindViewHolder(holder: AtorViewHolder, position: Int) {
        val selectedAtor = ators[position]
        holder.atorName.text = selectedAtor.name
        holder.atorNacionalidade.text = selectedAtor.nacionalidade

    }

    override fun getItemCount(): Int {
        return ators.size
    }
}

class AtorViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val atorName = v.findViewById<TextView>(R.id.nameAtor)
    val atorNacionalidade = v.findViewById<TextView>(R.id.nameNacionalidade)

}
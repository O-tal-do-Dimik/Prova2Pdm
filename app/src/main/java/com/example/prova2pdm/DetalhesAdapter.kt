package com.example.prova2pdm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetalhesAdapter : RecyclerView.Adapter<DetalhesAtorViewHolder>(){
    var ators: List<Ator> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):DetalhesAtorViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_detalhes, parent, false)
        return DetalhesAtorViewHolder(v)
    }

    override fun onBindViewHolder(holder: DetalhesAtorViewHolder, position: Int) {
        val selectedAtor = ators[position]
        holder.atorNacimento.text = selectedAtor.datanacimento
        holder.atorIndicacao.text = selectedAtor.indicacao
    }

    override fun getItemCount(): Int {
        return ators.size
    }
}


class DetalhesAtorViewHolder(v: View) : RecyclerView.ViewHolder(v) {


    val atorNacimento = v.findViewById<TextView>(R.id.nameNacimento)
    val atorIndicacao = v.findViewById<TextView>(R.id.nameIndicacao)
}

package com.example.prova2pdm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.prova2pdm.databinding.FragmentCadastraBinding

class CadastraFragment : Fragment() {
    lateinit var viewmodel: CadastraFragViewModel
    lateinit var binding: FragmentCadastraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cadastra, container, false)
        viewmodel = ViewModelProvider(this).get(CadastraFragViewModel::class.java)


        binding.button.setOnClickListener {
            viewmodel.name = binding.editTextName.text.toString()
            viewmodel.nacionalidade = binding.editTextNacionalidade.text.toString()
            viewmodel.datanacimento = binding.editTextDatanacimento.text.toString()
            viewmodel.indicacao = binding.editTextIndicacao.text.toString()
            viewmodel.idade = binding.editTextIdade.text.toString().toInt()
            viewmodel.oscar = binding.editTextOscar.text.toString().toInt()

            viewmodel.createAtor()
        }






        return binding.root
    }
}
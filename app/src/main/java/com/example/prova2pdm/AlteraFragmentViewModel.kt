package com.example.prova2pdm

import android.annotation.SuppressLint
import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room

class AlteraFragmentViewModel (application: Application) : AndroidViewModel(application) {
    private var dba: AppDatabase
    private lateinit var ator: Ator

    init {
        val db:AppDatabase by lazy {
            Room.databaseBuilder(application.applicationContext,
                AppDatabase::class.java, "ator.sqlite")
                .build()
        }
        dba = db
    }

    var id: Int = 0
    var name: String = ""
    var nacionalidade: String = ""
    var datanacimento: String = ""
    var indicacao: String = ""
    var idade: Int = 0
    var peso: Int = 0

    fun getAtor(id: Int) {
        var ator = GetAtorAsync(id).execute().get()

        this.id = ator.id
        this.name = ator.name
        this.nacionalidade = ator.nacionalidade
        this.datanacimento = ator.datanacimento
        this.indicacao = ator.indicacao
        this.idade = ator.idade
        this.peso = ator.oscar
    }

    @SuppressLint("StaticFieldLeak")
    private inner class UpdateAtorAsync() : AsyncTask<Unit, Unit, Unit>() {
        override fun doInBackground(vararg params: Unit?) {
            val a = Ator(
                name,
                nacionalidade,
                datanacimento,
                indicacao,
                idade,
                peso
            )

            a.id = id

            dba.AtorDAO().update(a)
        }
    }

    @SuppressLint("StaticFieldLeak")
    private inner class GetAtorAsync(var id: Int) : AsyncTask<Unit, Unit, Ator>() {
        override fun doInBackground(vararg params: Unit?): Ator {
            return dba.AtorDAO().findById(id)
        }
    }
}
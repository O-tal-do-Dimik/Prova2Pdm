package com.example.prova2pdm

import android.annotation.SuppressLint
import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room

class CadastraFragViewModel(application: Application) : AndroidViewModel(application) {

    private var dba: AppDatabase

    init {
        val db:AppDatabase by lazy {
            Room.databaseBuilder(application.applicationContext,
                AppDatabase::class.java, "ator.sqlite")
                .build()
        }
        dba = db
    }

    var name: String = ""
    var nacionalidade: String = ""
    var datanacimento: String = ""
    var indicacao: String = ""
    var idade: Int = 0
    var oscar: Int = 0

    fun createAtor() {
        CreateAtorAsync().execute().get()
    }

    @SuppressLint("StaticFieldLeak")
    private inner class CreateAtorAsync() : AsyncTask<Unit, Unit, Unit>() {
        override fun doInBackground(vararg params: Unit?) {
            val a = Ator(
                name,
                nacionalidade,
                datanacimento,
                indicacao,
                idade,
                oscar
            )

            dba.AtorDAO().insert(a)
        }
    }
}
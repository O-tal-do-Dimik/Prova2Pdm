package com.example.prova2pdm

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "ator_table")
data class Ator(
    var name: String,
    var nacionalidade: String,
    var datanacimento: String,
    var indicacao: String,
    var idade: Int,
    var oscar: Int

) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

package com.example.prova2pdm

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface AtorDAO {
    // cadastrar
    @Insert
    fun insert(ator: Ator): Long
    // editar
    @Update
    fun update(ator: Ator): Int
    // listar todos
    @Query("SELECT * FROM ator_table")
    fun listAll(): LiveData<List<Ator>>
    // listar por ID
    @Query("SELECT * FROM ator_table WHERE id = :id")
    fun findById(id: Int): Ator
    // excluir
    @Delete
    fun delete(ator: Ator): Int
}
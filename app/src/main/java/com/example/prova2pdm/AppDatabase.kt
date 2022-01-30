package com.example.prova2pdm

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Ator::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun AtorDAO(): AtorDAO
}
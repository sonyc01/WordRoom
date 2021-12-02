package com.example.roomdemo.models

import android.app.Application
import com.example.roomdemo.db.WordRepository
import com.example.roomdemo.db.WordRoomDatabase

class WordsApplication: Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}
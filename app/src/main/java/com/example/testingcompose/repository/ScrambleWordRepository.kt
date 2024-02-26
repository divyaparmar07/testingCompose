package com.example.testingcompose.repository

import com.example.testingcompose.model.ScrambleWord
import com.example.testingcompose.room.ScrambleWordDAO

class ScrambleWordRepository(private val scrambleWord: ScrambleWordDAO) {

    suspend fun insert(sw: ScrambleWord) {
        scrambleWord.insert(sw)
    }
    
}
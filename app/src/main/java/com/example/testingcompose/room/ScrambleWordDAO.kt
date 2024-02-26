package com.example.testingcompose.room

import androidx.room.Dao
import androidx.room.Insert
import com.example.testingcompose.model.ScrambleWord

@Dao
interface ScrambleWordDAO {

    @Insert
    suspend fun insert(scrambleWord: ScrambleWord)
}

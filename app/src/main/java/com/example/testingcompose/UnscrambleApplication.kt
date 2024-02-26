package com.example.testingcompose

import android.app.Application
import com.example.testingcompose.repository.ScrambleWordRepository
import com.example.testingcompose.room.ScrambleWordDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class UnscrambleApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { ScrambleWordDatabase.getDatabase(this) }
    val repository by lazy { ScrambleWordRepository(database.getDao()) }
}
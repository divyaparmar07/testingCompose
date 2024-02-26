package com.example.testingcompose.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.testingcompose.model.ScrambleWord
import com.example.testingcompose.repository.ScrambleWordRepository
import com.example.testingcompose.room.ScrambleWordDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UnscrambleWordViewModel(application: Application) : AndroidViewModel(application) {

    private var repository : ScrambleWordRepository

    init {
        val varDao = ScrambleWordDatabase.getDatabase(application).getDao()
        repository = ScrambleWordRepository(varDao)
    }
    fun insert(sw: ScrambleWord) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(sw)
        }
    }

}

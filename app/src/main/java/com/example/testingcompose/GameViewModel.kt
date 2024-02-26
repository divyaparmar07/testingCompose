package com.example.testingcompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(DataViewState())
    val uiState = _uiState.asStateFlow()

    private var usedWords: MutableSet<String> = mutableSetOf()

    var editTextWord1 by mutableStateOf("")
        private set

    private var resultingString by mutableStateOf("")
    private var resultingString2 by mutableStateOf("")
    private var resultingString3 by mutableStateOf("")
    private var resultingString4 by mutableStateOf("")
    private var resultingString5 by mutableStateOf("")
    private var resultingString6 by mutableStateOf("")

    fun textChanged1(text: String) {
        editTextWord1 = text
        usedWords.add(text)
        resultingString = findRepeatWords(editTextWord1)
        _uiState.value = _uiState.value.copy(scrambleWord = resultingString)
        resultingString2 = findRepeatWords(resultingString)
        _uiState.value = _uiState.value.copy(scrambleWord2 = resultingString2)
        resultingString3 = findRepeatWords(resultingString2)
        _uiState.value = _uiState.value.copy(scrambleWord3 = resultingString3)
        resultingString4 = findRepeatWords(resultingString3)
        _uiState.value = _uiState.value.copy(scrambleWord4 = resultingString4)
        resultingString5 = findRepeatWords(resultingString4)
        _uiState.value = _uiState.value.copy(scrambleWord5 = resultingString5)
        resultingString6 = findRepeatWords(resultingString5)
        _uiState.value = _uiState.value.copy(scrambleWord6 = resultingString6)

    }

    private fun findRepeatWords(text: String): String {
        var res = takeStringRandomly1(text)
        if (usedWords.contains(res)) {
            res = takeStringRandomly1(text)
        } else {
            usedWords.add(res)
        }
        return res
    }

    private fun takeStringRandomly1(word: String): String {
        val charArray = word.toCharArray()
        charArray.shuffle()
        return charArray.joinToString(separator = "")
    }

}

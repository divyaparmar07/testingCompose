package com.example.testingcompose.userinterface

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.testingcompose.GameViewModel
import com.example.testingcompose.R
import com.example.testingcompose.model.ScrambleWord
import com.example.testingcompose.viewmodel.UnscrambleWordViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen2(gameViewModel: GameViewModel = viewModel()) {
    val gameUiState by gameViewModel.uiState.collectAsState()
    val viewModel: UnscrambleWordViewModel = viewModel()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .size(width = 400.dp, height = 500.dp)
                .padding(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                OutlinedTextField(value = gameViewModel.editTextWord1,
                    onValueChange = {
                        gameViewModel.textChanged1(it)
//                        val scrambleWord = ScrambleWord(word = gameViewModel.editTextWord1, word1 = gameUiState.scrambleWord2, word2 = gameUiState.scrambleWord3, word3 = gameUiState.scrambleWord4, word4 = gameUiState.scrambleWord5, word5 = gameUiState.scrambleWord6)
//                        viewModel.insert(scrambleWord)
                    },
                    label = { Text(stringResource(R.string.enter_your_word)) })
                Text(
                    text = gameUiState.scrambleWord2,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 22.sp,

                    )
                Text(
                    text = gameUiState.scrambleWord3,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 22.sp,

                    )
                Text(
                    text = gameUiState.scrambleWord4,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 22.sp,

                    )
                Text(
                    text = gameUiState.scrambleWord5,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 22.sp,

                    )
                Text(
                    text = gameUiState.scrambleWord6,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 22.sp,

                    )

                 
            }
        }
    }

}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun GameScreen(gameViewModel: GameViewModel = viewModel()) {
//    val gameUiState by gameViewModel.uiState.collectAsState()
//    val viewModel: UnscrambleWordViewModel = viewModel()
//
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Card(
//            modifier = Modifier
//                .size(width = 400.dp, height = 300.dp)
//                .padding(20.dp),
//            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
//        ) {
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.fillMaxSize()
//            ) {
//
//                OutlinedTextField(
//                    value = gameViewModel.editTextWord1,
//                    onValueChange = { gameViewModel.textChanged(it) },
//                    label = { Text(stringResource(R.string.enter_your_word)) }
//                )
//
//                Text(
//                    text = gameUiState.scrambleWord,
//                    modifier = Modifier.padding(10.dp),
//                    fontSize = 22.sp,
//
//                    )
//                OutlinedButton(onClick = {
////                    val scrambleWord = ScrambleWord(word = gameViewModel.editTextWord1)
////                    viewModel.insert(scrambleWord)
//                }) {
//                    Text(text = "Submit")
//                }
//
//            }
//        }
//    }
//}
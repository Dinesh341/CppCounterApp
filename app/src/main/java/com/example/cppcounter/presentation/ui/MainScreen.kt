package com.example.cppcounter.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.cppcounter.presentation.viewmodel.CounterViewModel

@Composable
fun MainScreen(viewModel: CounterViewModel = hiltViewModel()) {

    val state by viewModel.uiState.collectAsStateWithLifecycle()

    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),    horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(
                onClick = { viewModel.increment() },
                enabled = !state.isLoading
            ) {
                Text("Click Button")
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {

                items(state.messages) { item ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {

                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {

                            Text("Count: ${item.count}")
                            Text("Time: ${item.timestamp}")

                        }
                    }
                }
            }
        }

        if (state.isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }
    }
}
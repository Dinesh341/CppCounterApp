package com.example.cppcounter.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cppcounter.domain.repository.CounterRepository
import com.example.cppcounter.utils.CounterUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(
    private val repository: CounterRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(CounterUiState())
    val uiState: StateFlow<CounterUiState> = _uiState

    init {
        viewModelScope.launch {
            repository.observeMessages().collect { list ->
                _uiState.value = _uiState.value.copy(
                    messages = list,
                    isLoading = false
                )
            }
        }
    }

    fun increment() {
        //Update loading status
        _uiState.value = _uiState.value.copy(isLoading = true)
        repository.increment()
    }
}


package com.example.cppcounter.utils

import com.example.cppcounter.data.model.ClickMessage

data class CounterUiState(
    val isLoading: Boolean = false,
    val messages: List<ClickMessage> = emptyList(),
    val error: String? = null
)
package com.example.cppcounter.domain.repository


import com.example.cppcounter.data.model.ClickMessage
import kotlinx.coroutines.flow.Flow

interface CounterRepository {

    fun observeMessages(): Flow<List<ClickMessage>>

    fun increment()
}
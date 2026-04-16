package com.example.cppcounter.domain.usecase


import com.example.cppcounter.domain.repository.CounterRepository
import javax.inject.Inject

class IncrementCounterUseCase @Inject constructor(
    private val repository: CounterRepository
) {

    operator fun invoke() {
        repository.increment()
    }
}
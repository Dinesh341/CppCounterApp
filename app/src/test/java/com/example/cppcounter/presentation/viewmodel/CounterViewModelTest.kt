package com.example.cppcounter.presentation.viewmodel


import app.cash.turbine.test
import com.example.cppcounter.MainDispatcherRule
import com.example.cppcounter.data.model.ClickMessage
import com.example.cppcounter.data.repository.CounterRepositoryImpl
import com.example.cppcounter.domain.repository.CounterRepository
import io.mockk.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class CounterViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private val repository: CounterRepository = mockk()

    private lateinit var viewModel: CounterViewModel

    @Before
    fun setup() {

        every { repository.observeMessages() } returns flowOf(emptyList())

        viewModel = CounterViewModel(repository)
    }

    @Test
    fun `increment should call repository increment`() = runTest {

        every { repository.increment() } returns Unit

        viewModel.increment()

        verify { repository.increment() }
    }

    @Test
    fun `uiState should update when repository emits data`() = runTest {

        val messages = listOf(
            ClickMessage(1, "10:00:00")
        )

        every { repository.observeMessages() } returns flowOf(messages)

        viewModel = CounterViewModel(repository)

        viewModel.uiState.test {
            awaitItem()
            val state = awaitItem()
            assertEquals(messages, state.messages)
        }
    }

    @Test
    fun `loading should be true when increment called`() = runTest {

        every { repository.increment() } returns Unit

        viewModel.increment()

        assertTrue(viewModel.uiState.value.isLoading)
    }

}
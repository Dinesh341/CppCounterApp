package com.example.cppcounter.data.repository

import com.example.cppcounter.data.model.ClickMessage
import com.example.cppcounter.domain.repository.CounterRepository
import com.example.nativelib.NativeBridge
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

class CounterRepositoryImpl @Inject constructor() : CounterRepository {

    private val messageList = mutableListOf<ClickMessage>()

    override fun observeMessages(): Flow<List<ClickMessage>> = callbackFlow {

        NativeBridge.setListener { count ->

            val time = SimpleDateFormat(
                "HH:mm:ss",
                Locale.getDefault()
            ).format(Date())

            val message = ClickMessage(count, time)

            messageList.add(message)

            trySend(messageList.toList())
        }

        awaitClose {
            NativeBridge.setListener(null)
        }
    }

    /**
     * Method to call the Native method to perform the increment operation
     */
    override fun increment() {
        NativeBridge.incrementCount()
    }
}
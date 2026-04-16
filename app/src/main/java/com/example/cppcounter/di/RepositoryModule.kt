package com.example.cppcounter.di

import com.example.cppcounter.data.repository.CounterRepositoryImpl
import com.example.cppcounter.domain.repository.CounterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(): CounterRepository {
        return CounterRepositoryImpl()
    }
}
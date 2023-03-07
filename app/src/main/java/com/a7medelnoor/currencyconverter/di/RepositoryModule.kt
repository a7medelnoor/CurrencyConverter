package com.a7medelnoor.currencyconverter.di

import com.a7medelnoor.currencyconverter.data.api.ApiService
import com.a7medelnoor.currencyconverter.data.respository.CurrencyConverterRepositoryImpl
import com.a7medelnoor.currencyconverter.domain.repository.CurrencyConverterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    // provide repository

    @Provides
    fun provideResponsibility(apiService: ApiService): CurrencyConverterRepository{
        return CurrencyConverterRepositoryImpl(apiService)
    }
}
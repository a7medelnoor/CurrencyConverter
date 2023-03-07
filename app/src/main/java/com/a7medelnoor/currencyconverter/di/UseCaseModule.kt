package com.a7medelnoor.currencyconverter.di

import com.a7medelnoor.currencyconverter.domain.repository.CurrencyConverterRepository
import com.a7medelnoor.currencyconverter.domain.usecase.GetCurrencyUseCase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    // provide get currency use case

    fun provideUseCase(currencyRepository: CurrencyConverterRepository): GetCurrencyUseCase{
        return GetCurrencyUseCase(currencyRepository)

    }
}
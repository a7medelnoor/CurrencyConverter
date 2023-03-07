package com.a7medelnoor.currencyconverter.domain.usecase

import com.a7medelnoor.currencyconverter.domain.repository.CurrencyConverterRepository

class GetCurrencyUseCase(private val currencyConverterRepo: CurrencyConverterRepository) {
    suspend operator fun invoke() = currencyConverterRepo.getCurrency()
}
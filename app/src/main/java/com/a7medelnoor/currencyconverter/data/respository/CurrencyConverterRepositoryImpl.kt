package com.a7medelnoor.currencyconverter.data.respository

import com.a7medelnoor.currencyconverter.data.api.ApiService
import com.a7medelnoor.currencyconverter.data.model.CurrencyResponse
import com.a7medelnoor.currencyconverter.domain.repository.CurrencyConverterRepository

class CurrencyConverterRepositoryImpl(private val apiService: ApiService) : CurrencyConverterRepository {
    override suspend fun getCurrency(): CurrencyResponse = apiService.getCurrency()

}
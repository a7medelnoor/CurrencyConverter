package com.a7medelnoor.currencyconverter.domain.repository

import com.a7medelnoor.currencyconverter.data.model.CurrencyResponse

interface CurrencyConverterRepository {
 suspend fun getCurrency(): CurrencyResponse
}
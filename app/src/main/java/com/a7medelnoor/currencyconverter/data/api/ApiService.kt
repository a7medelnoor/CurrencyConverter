package com.a7medelnoor.currencyconverter.data.api

import com.a7medelnoor.currencyconverter.data.model.CurrencyResponse
import retrofit2.http.GET


interface ApiService {

  @GET("latest/USD")
  suspend fun getCurrency(): CurrencyResponse
}
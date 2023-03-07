package com.a7medelnoor.currencyconverter.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.a7medelnoor.currencyconverter.data.model.CurrencyResponse
import com.a7medelnoor.currencyconverter.domain.usecase.GetCurrencyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrencyConverterViewModel @Inject constructor(
    private val getCurrencyUseCase: GetCurrencyUseCase
) : ViewModel() {

    private val _currencies: MutableStateFlow<CurrencyResponse?> = MutableStateFlow(null)
    val currency: StateFlow<CurrencyResponse?> = _currencies

    // get currency
    fun getCurrency() {

        viewModelScope.launch {
            try {
                _currencies.value = getCurrencyUseCase()
            } catch (e: java.lang.Exception) {
                Log.e("CurrencyViewModel", e.message.toString())
            }
        }

    }

}
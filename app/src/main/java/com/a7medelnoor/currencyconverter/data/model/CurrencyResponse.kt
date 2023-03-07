package com.a7medelnoor.currencyconverter.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrencyResponse(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "rate")
    val rates: Rates,
    val result: String
)
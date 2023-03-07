package com.a7medelnoor.currencyconverter.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.a7medelnoor.currencyconverter.data.model.Rates

@Dao
interface CurrencyDao {

    @Query("Select * from random_user")
    fun getAllCurrencies(): List<Rates>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrencies(result: Rates)
}
package com.a7medelnoor.currencyconverter.data.local

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.a7medelnoor.currencyconverter.data.model.Rates

@Database(entities = [Rates::class], version = 1)
abstract class CurrencyDatabase : RoomDatabase() {
    abstract fun userCurrencyDao(): CurrencyDao

}
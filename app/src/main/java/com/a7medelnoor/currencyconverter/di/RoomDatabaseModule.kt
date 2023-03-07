package com.a7medelnoor.currencyconverter.di

import android.content.Context
import androidx.room.Room
import com.a7medelnoor.currencyconverter.data.local.CurrencyDao
import com.a7medelnoor.currencyconverter.data.local.CurrencyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RoomDatabaseModule {


    @Provides
    fun provideRoomDao(currencyDatabase: CurrencyDatabase): CurrencyDao {
        return currencyDatabase.userCurrencyDao()
    }

    // provide database

    @Provides
    fun provideDatabase(@ApplicationContext applicationContext: Context): CurrencyDatabase {
        return Room.databaseBuilder(
            applicationContext,
            CurrencyDatabase::class.java,
            "currency"
        ).build()
    }

}
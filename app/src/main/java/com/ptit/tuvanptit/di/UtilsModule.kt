package com.ptit.tuvanptit.di

import com.ptit.tuvanptit.utils.AppDispatchers
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers

@InstallIn(SingletonComponent::class)
@Module
object UtilsModule {
    @Provides
    fun provideAppDispatchers() =
        AppDispatchers(Dispatchers.Main, Dispatchers.IO, Dispatchers.Default)
}
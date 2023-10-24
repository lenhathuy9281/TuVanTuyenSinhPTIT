package com.ptit.tuvanptit.di

import com.ptit.tuvanptit.data.repository.SchoolRepository
import com.ptit.tuvanptit.data.repository.SchoolRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSchoolRepository(impl: SchoolRepositoryImpl): SchoolRepository
}
package com.ptit.tuvanptit.data.repository

import com.ptit.tuvanptit.data.remote.SchoolService
import com.ptit.tuvanptit.utils.remote.Resource
import javax.inject.Inject

class SchoolRepositoryImpl @Inject constructor(private val schoolService: SchoolService): SchoolRepository {
    override suspend fun getSchools(): Resource<SchoolResponse> {
        return schoolService.getSchools()
    }
}
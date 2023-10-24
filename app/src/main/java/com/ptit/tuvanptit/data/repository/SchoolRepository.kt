package com.ptit.tuvanptit.data.repository

import com.ptit.tuvanptit.utils.remote.Resource

interface SchoolRepository {
    suspend fun getSchools(): Resource<SchoolResponse>
}
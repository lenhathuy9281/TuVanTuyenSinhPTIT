package com.ptit.tuvanptit.data.remote

import com.ptit.tuvanptit.data.repository.SchoolResponse
import com.ptit.tuvanptit.utils.remote.Resource
import retrofit2.http.GET

interface SchoolService {
    @GET("school")
    suspend fun getSchools(): Resource<SchoolResponse>
}
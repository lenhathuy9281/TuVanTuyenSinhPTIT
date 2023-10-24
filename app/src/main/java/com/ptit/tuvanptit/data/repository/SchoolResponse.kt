package com.ptit.tuvanptit.data.repository

import com.google.gson.annotations.SerializedName

data class SchoolResponse(
    @SerializedName("school") val school: String? = ""
)

package com.starostinvlad.githubapiapp.api

import okhttp3.ResponseBody
import retrofit2.http.GET

interface NetworkService {
    @GET
    suspend fun getRepositiories(): ResponseBody
}
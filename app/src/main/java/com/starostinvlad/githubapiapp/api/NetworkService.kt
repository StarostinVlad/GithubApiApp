package com.starostinvlad.githubapiapp.api

import retrofit2.http.GET

interface NetworkService {
    @GET("/repositories")
    suspend fun getRepositiories(): List<RepositoryEntity>
}
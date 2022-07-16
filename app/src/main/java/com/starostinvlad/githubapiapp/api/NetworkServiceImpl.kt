package com.starostinvlad.githubapiapp.api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody

class NetworkServiceImpl : NetworkService {
    override suspend fun getRepositiories(): ResponseBody = withContext(Dispatchers.IO) {
        TODO("Not yet implemented")
    }
}
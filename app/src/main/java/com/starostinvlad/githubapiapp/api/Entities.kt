package com.starostinvlad.githubapiapp.api

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName
import com.starostinvlad.githubapiapp.adapter.Item
import java.lang.reflect.Type

data class RepositoryEntity(
    val id: String,
    val name: String,
    val owner: Owner,
    val description: String
) : Item

data class Owner(val login: String)
//
//class RepositoryEntityDeserializer : JsonDeserializer<RepositoryEntity> {
//    override fun deserialize(
//        json: JsonElement?,
//        typeOfT: Type?,
//        context: JsonDeserializationContext?
//    ): RepositoryEntity {
//        json as Jso
//    }
//
//}
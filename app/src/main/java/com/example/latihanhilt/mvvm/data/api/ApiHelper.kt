package com.example.latihanhilt.mvvm.data.api

import com.example.latihanhilt.mvvm.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}
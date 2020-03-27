package com.example.marvel.project.api

import com.example.marvel.project.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object{
        fun getClient(): ApiClient{
            var retrofit = Retrofit.Builder()
                .baseUrl(Constants.Url.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiClient::class.java)
        }
    }
}
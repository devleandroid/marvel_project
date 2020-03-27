package com.example.marvel.project.api

import com.example.marvel.project.model.ResultComics
import com.example.marvel.project.util.Constants
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {

    @GET("/")
    fun getResults(): Call<List<ResultComics>>

    companion object{
        fun create(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.Url.baseUrl)
                .build()
            return  retrofit.create(ApiInterface::class.java)
        }
    }
}
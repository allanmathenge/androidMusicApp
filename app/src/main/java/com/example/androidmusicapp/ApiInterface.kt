package com.example.androidmusicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("X-RapidAPI-Key: ee02278c23mshe3d1bd04a2e4b2ep190b82jsn92c90658c75e","X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String): Call<MyData>
}
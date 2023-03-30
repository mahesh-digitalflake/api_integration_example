package com.example.apiintegrationexample

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("products")
    fun getData():Call<DataModel>
}
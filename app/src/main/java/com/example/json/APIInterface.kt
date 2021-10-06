package com.example.json


import retrofit2.Call
import retrofit2.http.GET


interface APIInterface { //this page constant just change Url
    @GET("/api/unknown")
    fun doGetListResources(): Call<BookDetails?>?
}
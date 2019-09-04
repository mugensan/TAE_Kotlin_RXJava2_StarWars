package com.example.tae_kotlin_rxjava2_starwars.network

import com.example.tae_kotlin_rxjava2_starwars.models.StarWarsModel
import io.reactivex.Observable
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("people")
    fun getName(): Observable<StarWarsModel>
}
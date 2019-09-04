package com.example.tae_kotlin_rxjava2_starwars.models

import com.google.gson.annotations.SerializedName

data class StarWarsModel (

	@SerializedName("count") val count : Int,
	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String,
	@SerializedName("results") val results : List<Results>
)
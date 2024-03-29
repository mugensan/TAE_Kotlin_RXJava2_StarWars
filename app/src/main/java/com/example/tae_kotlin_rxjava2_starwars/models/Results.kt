package com.example.tae_kotlin_rxjava2_starwars.models

import com.google.gson.annotations.SerializedName


data class Results (

	@SerializedName("name") val name : String,
	@SerializedName("height") val height : Int,
	@SerializedName("mass") val mass : Int,
	@SerializedName("hair_color") val hair_color : String,
	@SerializedName("skin_color") val skin_color : String,
	@SerializedName("eye_color") val eye_color : String,
	@SerializedName("birth_year") val birth_year : String,
	@SerializedName("gender") val gender : String,
	@SerializedName("homeworld") val homeworld : String,
	@SerializedName("films") val films : List<String>,
	@SerializedName("species") val species : List<String>,
	@SerializedName("vehicles") val vehicles : List<String>,
	@SerializedName("starships") val starships : List<String>,
	@SerializedName("created") val created : String,
	@SerializedName("edited") val edited : String,
	@SerializedName("url") val url : String
)
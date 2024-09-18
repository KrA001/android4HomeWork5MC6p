package com.example.android4homework5mc6p.data.remote.models.location

import com.google.gson.annotations.SerializedName

data class LocationResponse(
    @SerializedName("results")
    val results: List<ResultsItemLocation>?,
    @SerializedName("info")
    val info: Info
)
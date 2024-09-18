package com.example.android4homework5mc6p.data.remote.models.location

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("next")
    val next: String = "",
    @SerializedName("pages")
    val pages: Int = 0,
    @SerializedName("prev")
    val prev: String? = null,
    @SerializedName("count")
    val count: Int = 0
)
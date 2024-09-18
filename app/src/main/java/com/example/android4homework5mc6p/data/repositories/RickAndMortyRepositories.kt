package com.example.android4homework5mc6p.data.repositories

import com.example.android4homework5mc6p.data.remote.apiservise.RickAndMortyApi
import javax.inject.Inject

class RickAndMortyRepositories @Inject constructor(
    private val rickAndMortyApi: RickAndMortyApi
) {
    suspend fun getCharacter() = rickAndMortyApi.getCharacter()
    suspend fun getLocation() = rickAndMortyApi.getLocation()
}
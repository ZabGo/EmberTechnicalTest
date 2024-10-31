package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.AmenitiesApi
import kotlinx.serialization.Serializable

@Serializable
data class Amenities(
    val hasWifi: Boolean,
    val hasToilet: Boolean
)

fun AmenitiesApi.toAmenities() = Amenities(
    hasWifi = hasWifi,
    hasToilet = hasToilet
)
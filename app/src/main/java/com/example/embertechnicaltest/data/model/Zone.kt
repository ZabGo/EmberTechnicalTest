package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.ZoneApi
import kotlinx.serialization.Serializable

@Serializable
data class Zone(
    val latitude: Double,
    val longitude: Double
)

fun ZoneApi.toZone() = Zone(
    latitude = latitude,
    longitude = longitude
)
package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ZoneApi(
    @SerialName("latitude") val latitude: Double,
    @SerialName("longitude") val longitude: Double
)
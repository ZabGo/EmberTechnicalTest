package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AmenitiesApi(
    @SerialName("has_wifi") val hasWifi: Boolean,
    @SerialName("has_toilet") val hasToilet: Boolean
)
package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AvailabilityApi(
    @SerialName("seat") val seat: Int,
    @SerialName("wheelchair") val wheelchair: Int,
    @SerialName("bicycle") val bicycle: Int
)
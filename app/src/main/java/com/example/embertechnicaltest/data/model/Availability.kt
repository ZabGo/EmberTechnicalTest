package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.AvailabilityApi
import kotlinx.serialization.Serializable

@Serializable
data class Availability(
    val seat: Int,
    val wheelchair: Int,
    val bicycle: Int
)

fun AvailabilityApi.toAvailability() = Availability(
    seat = seat,
    wheelchair = wheelchair,
    bicycle = bicycle
)
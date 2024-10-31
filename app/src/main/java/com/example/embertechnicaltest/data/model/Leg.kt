package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.LegApi
import kotlinx.serialization.Serializable

@Serializable
data class Leg(
    val type: String,
    val tripUid: String,
    val addsCapacityForTripUid: String?,
    val origin: Stop,
    val destination: Stop,
    val departure: Schedule,
    val arrival: Schedule,
    val description: VehicleDescription,
    val tripType: String
)

fun LegApi.toLeg() = Leg(
    type = type,
    tripUid = tripUid,
    addsCapacityForTripUid = addsCapacityForTripUid,
    origin = origin.toStop(),
    destination = destination.toStop(),
    departure = departure.toSchedule(),
    arrival = arrival.toSchedule(),
    description = description.toVehicleDescription(),
    tripType = tripType
)
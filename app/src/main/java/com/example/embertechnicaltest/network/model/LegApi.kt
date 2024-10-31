package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LegApi(
    @SerialName("type") val type: String,
    @SerialName("trip_uid") val tripUid: String,
    @SerialName("adds_capacity_for_trip_uid") val addsCapacityForTripUid: String?,
    @SerialName("origin") val origin: StopApi,
    @SerialName("destination") val destination: StopApi,
    @SerialName("departure") val departure: ScheduleApi,
    @SerialName("arrival") val arrival: ScheduleApi,
    @SerialName("description") val description: VehicleDescriptionApi,
    @SerialName("trip_type") val tripType: String
)
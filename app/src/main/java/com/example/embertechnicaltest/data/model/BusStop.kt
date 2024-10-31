package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.BusStopApi
import kotlinx.serialization.Serializable

@Serializable
data class BusStop(
    val id: Int,
    val departure: Schedule,
    val arrival: Schedule,
    val location: Location,
    val allowBoarding: Boolean,
    val allowDropOff: Boolean,
    val bookingCutOffMins: Int,
    val preBookedOnly: Boolean,
    val skipped: Boolean
)

fun BusStopApi.toRoute() = BusStop(
    id = id,
    departure = departure.toSchedule(),
    arrival = arrival.toSchedule(),
    location = location.toLocation(),
    allowBoarding = allowBoarding,
    allowDropOff = allowDropOff,
    bookingCutOffMins = bookingCutOffMins,
    preBookedOnly = preBookedOnly,
    skipped = skipped
)
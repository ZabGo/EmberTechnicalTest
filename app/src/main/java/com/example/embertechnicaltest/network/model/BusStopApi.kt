package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BusStopApi(
    @SerialName("id") val id: Int,
    @SerialName("departure") val departure: ScheduleApi,
    @SerialName("arrival") val arrival: ScheduleApi,
    @SerialName("location") val location: LocationApi,
    @SerialName("allow_boarding") val allowBoarding: Boolean,
    @SerialName("allow_drop_off") val allowDropOff: Boolean,
    @SerialName("booking_cut_off_mins") val bookingCutOffMins: Int,
    @SerialName("pre_booked_only") val preBookedOnly: Boolean,
    @SerialName("skipped") val skipped: Boolean
)
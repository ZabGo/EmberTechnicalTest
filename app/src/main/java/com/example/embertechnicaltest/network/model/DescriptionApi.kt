package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DescriptionApi(
    @SerialName("route_number") val routeNumber: String,
    @SerialName("pattern_id") val patternId: Int,
    @SerialName("calendar_date") val calendarDate: String,
    @SerialName("type") val type: String,
    @SerialName("is_cancelled") val isCancelled: Boolean,
    @SerialName("route_id") val routeId: Int
)
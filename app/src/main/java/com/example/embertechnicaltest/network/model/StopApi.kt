package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StopApi(
    @SerialName("id") val id: Int,
    @SerialName("atco_code") val atcoCode: String,
    @SerialName("detailed_name") val detailedName: String,
    @SerialName("lat") val lat: Double,
    @SerialName("lon") val lon: Double,
    @SerialName("name") val name: String,
    @SerialName("region_name") val regionName: String,
    @SerialName("type") val type: String,
    @SerialName("code") val code: String,
    @SerialName("code_detail") val codeDetail: String,
    @SerialName("timezone") val timezone: String,
    @SerialName("heading") val heading: Int,
    @SerialName("zone") val zone: List<ZoneApi>,
    @SerialName("area_id") val areaId: Int,
    @SerialName("location_time_id") val locationTimeId: Int,
    @SerialName("booking_cut_off_mins") val bookingCutOffMins: Int,
    @SerialName("pre_booked_only") val preBookedOnly: Boolean,
    @SerialName("skipped") val skipped: Boolean,
    @SerialName("bookable") val bookable: String
)
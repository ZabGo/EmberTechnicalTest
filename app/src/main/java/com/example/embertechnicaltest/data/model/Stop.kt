package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.StopApi
import kotlinx.serialization.Serializable

@Serializable
data class Stop(
    val id: Int,
    val atcoCode: String,
    val detailedName: String,
    val lat: Double,
    val lon: Double,
    val name: String,
    val regionName: String,
    val type: String,
    val code: String,
    val codeDetail: String,
    val timezone: String,
    val heading: Int,
    val zone: List<Zone>,
    val areaId: Int,
    val locationTimeId: Int,
    val bookingCutOffMins: Int,
    val preBookedOnly: Boolean,
    val skipped: Boolean,
    val bookable: String
)

fun StopApi.toStop() = Stop(
    id = id,
    atcoCode = atcoCode,
    detailedName = detailedName,
    lat = lat,
    lon = lon,
    name = name,
    regionName = regionName,
    type = type,
    code = code,
    codeDetail = codeDetail,
    timezone = timezone,
    heading = heading,
    zone = zone.map { it.toZone() },
    areaId = areaId,
    locationTimeId = locationTimeId,
    bookingCutOffMins = bookingCutOffMins,
    preBookedOnly = preBookedOnly,
    skipped = skipped,
    bookable = bookable
)
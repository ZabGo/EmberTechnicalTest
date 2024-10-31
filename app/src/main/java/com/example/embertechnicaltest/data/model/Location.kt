package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.LocationApi
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val id: Int,
    val type: String,
    val name: String,
    val regionName: String,
    val code: String,
    val codeDetail: String,
    val detailedName: String,
    val localName: String,
    val lon: Double,
    val lat: Double,
    val googlePlaceId: String,
    val atcoCode: String,
    val timezone: String,
    val zone: List<Zone>,
    val heading: Double,
    val areaId: Int
)

fun LocationApi.toLocation() = Location(
    id = id,
    type = type,
    name = name,
    regionName = regionName,
    code = code,
    codeDetail = codeDetail,
    detailedName = detailedName,
    localName = localName,
    lon = lon,
    lat = lat,
    googlePlaceId = googlePlaceId,
    atcoCode = atcoCode,
    timezone = timezone,
    zone = zone.map { it.toZone() },
    heading = heading,
    areaId = areaId
)
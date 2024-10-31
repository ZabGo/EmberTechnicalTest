package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocationApi(
    @SerialName("id") val id: Int = 0,
    @SerialName("type") val type: String = "",
    @SerialName("name") val name: String = "",
    @SerialName("region_name") val regionName: String = "",
    @SerialName("code") val code: String = "",
    @SerialName("code_detail") val codeDetail: String = "",
    @SerialName("detailed_name") val detailedName: String = "",
    @SerialName("local_name") val localName: String = "",
    @SerialName("lon") val lon: Double = 0.0,
    @SerialName("lat") val lat: Double = 0.0,
    @SerialName("google_place_id") val googlePlaceId: String = "",
    @SerialName("atco_code") val atcoCode: String = "",
    @SerialName("timezone") val timezone: String = "",
    @SerialName("zone") val zone: List<ZoneApi> = listOf(),
    @SerialName("heading") val heading: Double = 0.0,
    @SerialName("area_id") val areaId: Int = 0
)
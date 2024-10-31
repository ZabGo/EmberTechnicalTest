package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PricesApi(
    @SerialName("adult") val adult: Int,
    @SerialName("child") val child: Int,
    @SerialName("young_child") val youngChild: Int,
    @SerialName("concession") val concession: Int,
    @SerialName("seat") val seat: Int,
    @SerialName("wheelchair") val wheelchair: Int,
    @SerialName("bicycle") val bicycle: Int
)
package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QuoteApi(
    @SerialName("availability") val availability: AvailabilityApi,
    @SerialName("prices") val prices: PricesApi,
    @SerialName("legs") val legs: List<LegApi>,
    @SerialName("bookable") val bookable: Boolean
)
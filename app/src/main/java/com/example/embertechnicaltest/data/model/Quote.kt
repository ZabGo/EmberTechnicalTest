package com.example.embertechnicaltest.data.model
import com.example.embertechnicaltest.network.model.QuoteApi
import kotlinx.serialization.Serializable

@Serializable
data class Quote(
    val availability: Availability,
    val prices: Prices,
    val legs: List<Leg>,
    val bookable: Boolean
)

fun QuoteApi.toQuote() = Quote(
    availability = availability.toAvailability(),
    prices = prices.toPrices(),
    legs = legs.map { it.toLeg() },
    bookable = bookable
)
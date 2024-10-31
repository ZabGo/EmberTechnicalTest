package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QuoteResponse(
    @SerialName("quotes") val quotes: List<QuoteApi>,
    @SerialName("min_card_transaction") val minCardTransaction: Int
)
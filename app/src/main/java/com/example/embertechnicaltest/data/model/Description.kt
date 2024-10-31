package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.DescriptionApi
import kotlinx.serialization.Serializable

@Serializable
data class Description(
    val routeNumber: String,
    val patternId: Int,
    val calendarDate: String,
    val type: String,
    val isCancelled: Boolean,
    val routeId: Int
)

fun DescriptionApi.toDescription() = Description(
    routeNumber = routeNumber,
    patternId = patternId,
    calendarDate = calendarDate,
    type = type,
    isCancelled = isCancelled,
    routeId = routeId
)
package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ScheduleApi(
    @SerialName("scheduled") val scheduled: String = "",
    @SerialName("actual") val actual: String = "",
    @SerialName("estimated") val estimated: String = ""
)
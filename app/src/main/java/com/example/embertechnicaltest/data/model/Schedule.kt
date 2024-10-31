package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.ScheduleApi
import kotlinx.serialization.Serializable

@Serializable
data class Schedule(
    val scheduled: String = "",
    val actual: String = "",
    val estimated: String = ""
)

fun ScheduleApi.toSchedule() = Schedule(
    scheduled = scheduled,
    actual = actual,
    estimated = estimated
)
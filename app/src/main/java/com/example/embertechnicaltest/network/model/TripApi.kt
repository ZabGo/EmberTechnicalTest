package com.example.embertechnicaltest.network.model

import kotlinx.serialization.Serializable

@Serializable
data class TripApi(val route: List<BusStopApi>, val vehicle: VehicleApi, val description: DescriptionApi)
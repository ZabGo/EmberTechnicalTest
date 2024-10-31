package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.TripApi
import kotlinx.serialization.Serializable

@Serializable
data class Trip(val route: List<BusStop>, val vehicle: Vehicle, val description: Description)

fun TripApi.toTrip() = Trip(
    route = route.map { it.toRoute() },
    vehicle = vehicle.toVehicle(),
    description = description.toDescription()
)
package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.VehicleDescriptionApi
import kotlinx.serialization.Serializable

@Serializable
data class VehicleDescription(
    val brand: String,
    val operator: String,
    val destinationBoard: String,
    val numberPlate: String,
    val vehicleType: String,
    val colour: String,
    val amenities: Amenities,
    val isElectric: Boolean
)

fun VehicleDescriptionApi.toVehicleDescription() = VehicleDescription(
    brand = brand,
    operator = operator,
    destinationBoard = destinationBoard,
    numberPlate = numberPlate,
    vehicleType = vehicleType,
    colour = colour,
    amenities = amenities.toAmenities(),
    isElectric = isElectric
)
package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VehicleDescriptionApi(
    @SerialName("brand") val brand: String,
    @SerialName("operator") val operator: String,
    @SerialName("destination_board") val destinationBoard: String,
    @SerialName("number_plate") val numberPlate: String,
    @SerialName("vehicle_type") val vehicleType: String,
    @SerialName("colour") val colour: String,
    @SerialName("amenities") val amenities: AmenitiesApi,
    @SerialName("is_electric") val isElectric: Boolean
)
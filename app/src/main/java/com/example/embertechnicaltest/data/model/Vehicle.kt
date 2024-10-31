package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.VehicleApi
import kotlinx.serialization.Serializable

@Serializable
data class Vehicle(
    val wheelchair: Int,
    val bicycle: Int,
    val seat: Int,
    val id: Int,
    val name: String,
    val hasWifi: Boolean,
    val hasToilet: Boolean,
    val isBackupVehicle: Boolean
)

fun VehicleApi.toVehicle()= Vehicle(
    wheelchair = wheelchair,
    bicycle = bicycle,
    seat = seat,
    id = id,
    name = name,
    hasWifi = hasWifi,
    hasToilet = hasToilet,
    isBackupVehicle = isBackupVehicle
)
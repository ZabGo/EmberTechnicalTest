package com.example.embertechnicaltest.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VehicleApi(
    @SerialName("wheelchair") val wheelchair: Int,
    @SerialName("bicycle") val bicycle: Int,
    @SerialName("seat") val seat: Int,
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
    @SerialName("has_wifi") val hasWifi: Boolean,
    @SerialName("has_toilet") val hasToilet: Boolean,
    @SerialName("is_backup_vehicle") val isBackupVehicle: Boolean
)
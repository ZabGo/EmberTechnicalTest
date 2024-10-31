package com.example.embertechnicaltest.domain

import com.example.embertechnicaltest.data.TripRepository
import com.example.embertechnicaltest.data.model.BusStop
import com.example.embertechnicaltest.data.model.Quote

class GetTripDetailsUseCase(private val repository: TripRepository) {
    suspend operator fun invoke(quote: Quote): List<BusStop> {
        // We would get the data quote object from the screen that displays the list of possible trips
        val tripDetails = quote.legs[0]
        return try {
            val listOfStop = repository.getRouteDetails(tripDetails.tripUid).route

            val originStopIndex = listOfStop.indexOfFirst {
                it.location.id == tripDetails.origin.id
            }

            val destinationStopIndex = listOfStop.indexOfFirst {
                it.location.id == tripDetails.destination.id
            }
            listOfStop.subList(originStopIndex, destinationStopIndex + 1)
        } catch (e: Exception) {
            throw Exception("error occured: $e")
        }
    }
}
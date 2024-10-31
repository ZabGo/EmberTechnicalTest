package com.example.embertechnicaltest.data

import com.example.embertechnicaltest.data.model.Quote
import com.example.embertechnicaltest.data.model.Trip

interface TripRepository {
    suspend fun getAllTrips(): List<Quote>
    suspend fun getRouteDetails(tripId: String): Trip
}
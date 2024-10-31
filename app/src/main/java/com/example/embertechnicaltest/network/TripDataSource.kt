package com.example.embertechnicaltest.network

import com.example.embertechnicaltest.network.model.QuoteApi
import com.example.embertechnicaltest.network.model.TripApi

interface TripDataSource {
   suspend fun getAllTrips(): List<QuoteApi>
   suspend fun getRouteDetails(tripId: String): TripApi
}
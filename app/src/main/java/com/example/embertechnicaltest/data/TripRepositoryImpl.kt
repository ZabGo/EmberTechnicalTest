package com.example.embertechnicaltest.data

import com.example.embertechnicaltest.data.model.Quote
import com.example.embertechnicaltest.data.model.Trip
import com.example.embertechnicaltest.data.model.toQuote
import com.example.embertechnicaltest.data.model.toTrip
import com.example.embertechnicaltest.network.TripDataSource

class TripRepositoryImpl(private val dataSource: TripDataSource) : TripRepository {
    override suspend fun getAllTrips(): List<Quote> =
        try {
            dataSource.getAllTrips().map { it.toQuote() }
        } catch (e: Exception) {
            throw Exception("error occured: $e")
        }


    override suspend fun getRouteDetails(tripId: String): Trip =
        dataSource.getRouteDetails(tripId).toTrip()
}
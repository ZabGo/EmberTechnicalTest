package com.example.embertechnicaltest.network

import com.example.embertechnicaltest.network.model.QuoteApi
import com.example.embertechnicaltest.network.model.QuoteResponse
import com.example.embertechnicaltest.network.model.TripApi
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class TripDataSourceImpl(
    private val dispatcher: CoroutineDispatcher,
    private val httpClient: HttpClient
) : TripDataSource {
    override suspend fun getAllTrips(): List<QuoteApi> =
        withContext(dispatcher) {
            try {
                val response:QuoteResponse =  httpClient.get(TRIPS).body()
                response.quotes
            }catch (e: Exception){
                throw Exception("error occured: $e")
            }
        }

    override suspend fun getRouteDetails(tripId: String): TripApi =
        withContext(dispatcher) {
            httpClient.get(getRoute(tripId)).body()
        }
}
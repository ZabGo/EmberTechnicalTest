package com.example.embertechnicaltest.di

import com.example.embertechnicaltest.data.TripRepository
import com.example.embertechnicaltest.data.TripRepositoryImpl
import com.example.embertechnicaltest.domain.GetTripDetailsUseCase
import com.example.embertechnicaltest.network.TripDataSource
import com.example.embertechnicaltest.network.TripDataSourceImpl
import com.example.embertechnicaltest.screens.TripDetailsViewModel
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val module = module {
    single<HttpClient> {
        HttpClient(Android) {
            install(ContentNegotiation) {
                json(json = Json {
                    ignoreUnknownKeys = true
                    encodeDefaults = true
                    isLenient = true
                    allowSpecialFloatingPointValues = true
                    allowStructuredMapKeys = true
                    prettyPrint = false
                    useArrayPolymorphism = false

                })

            }
        }
    }

    viewModel { TripDetailsViewModel(useCase = get()) }

    single<GetTripDetailsUseCase> { GetTripDetailsUseCase(repository = get()) }

    single<TripDataSource> { TripDataSourceImpl(dispatcher = Dispatchers.IO, httpClient = get()) }

    single<TripRepository> { TripRepositoryImpl(dataSource = get()) }
}
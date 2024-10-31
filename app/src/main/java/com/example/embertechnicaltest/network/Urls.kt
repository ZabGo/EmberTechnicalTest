package com.example.embertechnicaltest.network

const val TRIPS = "https://api.ember.to/v1/quotes/?origin=13&destination=42&departure_date_from=2024-11-01T17:30:00Z&departure_date_to=2024-11-01T19:00:00Z"

fun getRoute(tripId: String) = "https://api.ember.to/v1/trips/$tripId/"

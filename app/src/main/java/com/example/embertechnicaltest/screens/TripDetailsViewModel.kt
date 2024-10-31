package com.example.embertechnicaltest.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.embertechnicaltest.data.model.BusStop
import com.example.embertechnicaltest.data.model.Quote
import com.example.embertechnicaltest.domain.GetTripDetailsUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class TripDetailsViewModel(private val useCase: GetTripDetailsUseCase) : ViewModel() {
    var loading by mutableStateOf(true)
    var stopsOfTrip by mutableStateOf<List<BusStop>>(listOf())
        private set
    var error by mutableStateOf("")

    val handler = CoroutineExceptionHandler { _, exception ->
        error = "${exception.message}"
        loading = false
    }

    fun getTripDetails(quote: Quote) {
        viewModelScope.launch(handler) {
            stopsOfTrip = useCase(quote)
            loading = false
        }
    }
}
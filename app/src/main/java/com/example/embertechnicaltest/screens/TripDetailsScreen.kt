package com.example.embertechnicaltest.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.embertechnicaltest.ui.components.DisplayError
import com.example.embertechnicaltest.ui.components.DisplayLoadingIndicator
import com.example.embertechnicaltest.ui.components.StopItem
import com.example.embertechnicaltest.utils.getQuoteDataClass
import org.koin.androidx.compose.koinViewModel

@Composable
fun TripDetailsScreen(viewModel: TripDetailsViewModel = koinViewModel()) {

    LaunchedEffect(Unit) {
        val quote = getQuoteDataClass()
        viewModel.getTripDetails(quote)
    }

    if (viewModel.error.isNotEmpty()) DisplayError(viewModel.error)

    if (viewModel.loading) DisplayLoadingIndicator()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column {
            Text(text = "From: Slessor Gardens, Dundee")
            Text(text = "To:  George Street, Edinburgh")
        }
        Spacer(modifier = Modifier.height(24.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            itemsIndexed(viewModel.stopsOfTrip) { index, route ->
                StopItem(viewModel.stopsOfTrip.size, index, route)
                Spacer(modifier = Modifier.height(18.dp))
            }
        }

    }
}
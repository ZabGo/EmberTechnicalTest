package com.example.embertechnicaltest.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.embertechnicaltest.data.model.BusStop
import com.example.embertechnicaltest.ui.theme.emberGreen
import com.example.embertechnicaltest.ui.theme.emberRed
import com.example.embertechnicaltest.utils.extractTimeFromDateTime

@Composable
fun StopItem(listSize: Int, index: Int, busStop: BusStop) {
    var moreInformationDisplay = remember {
        mutableStateOf(false)
    }
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = setBackgroundColor(
                listSize = listSize,
                index = index
            )
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column() {
                    Text(
                        style = MaterialTheme.typography.titleMedium,
                        text = "Arr. ${extractTimeFromDateTime(busStop.arrival.scheduled)}"
                    )

                    Text(
                        style = MaterialTheme.typography.titleMedium,
                        text = "Depart. ${extractTimeFromDateTime(busStop.departure.scheduled)}"
                    )
                }

                Column(
                    horizontalAlignment = AbsoluteAlignment.Right
                ) {
                    Text(
                        style = MaterialTheme.typography.titleMedium,
                        text = busStop.location.detailedName
                    )
                    Text(text = busStop.location.regionName)
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            if (busStop.preBookedOnly || busStop.bookingCutOffMins != 0) {
                Text(text = "More info", style = TextStyle(
                    textDecoration = TextDecoration.Underline
                ), modifier = Modifier.clickable {
                    moreInformationDisplay.value = !moreInformationDisplay.value
                })
            }

            if (moreInformationDisplay.value) {
                Spacer(modifier = Modifier.height(8.dp))
                Column() {
                    if (busStop.preBookedOnly) Text(
                        style = MaterialTheme.typography.bodyMedium,
                        text = "Pre-booked only"
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    if (busStop.bookingCutOffMins != 0) Text(text = "Tickets must be booked online at least 10 minutes before the scheduled departure time")
                }
            }
        }
    }
}

fun setBackgroundColor(listSize: Int, index: Int): Color {
    return when (index) {
        0 -> {
            emberGreen
        }
        listSize - 1 -> {
            emberRed
        }
        else -> {
            Color.White
        }
    }
}
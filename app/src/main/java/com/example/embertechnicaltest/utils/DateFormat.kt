package com.example.embertechnicaltest.utils

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

fun extractTimeFromDateTime(dateTimeString: String): String {
    // Parse the date-time string
    val dateTime = OffsetDateTime.parse(dateTimeString)
    // Format to display only the time part
    return dateTime.format(DateTimeFormatter.ofPattern("HH:mm"))
}
package com.example.embertechnicaltest.data.model

import com.example.embertechnicaltest.network.model.PricesApi
import kotlinx.serialization.Serializable

@Serializable
data class Prices(
    val adult: Int,
    val child: Int,
    val youngChild: Int,
    val concession: Int,
    val seat: Int,
    val wheelchair: Int,
    val bicycle: Int
)

fun PricesApi.toPrices() = Prices(
    adult = adult,
    child = child,
    youngChild = youngChild,
    concession = concession,
    seat = seat,
    wheelchair = wheelchair,
    bicycle = bicycle
)
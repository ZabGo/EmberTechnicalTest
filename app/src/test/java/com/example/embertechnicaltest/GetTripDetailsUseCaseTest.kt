package com.example.embertechnicaltest

import com.example.embertechnicaltest.data.TripRepository
import com.example.embertechnicaltest.data.model.Availability
import com.example.embertechnicaltest.data.model.BusStop
import com.example.embertechnicaltest.data.model.Description
import com.example.embertechnicaltest.data.model.Location
import com.example.embertechnicaltest.data.model.Prices
import com.example.embertechnicaltest.data.model.Quote
import com.example.embertechnicaltest.data.model.Schedule
import com.example.embertechnicaltest.data.model.Trip
import com.example.embertechnicaltest.data.model.Vehicle
import com.example.embertechnicaltest.domain.GetTripDetailsUseCase
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.RelaxedMockK
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class GetTripDetailsUseCaseTest {

    @RelaxedMockK
    private lateinit var repository: TripRepository

    @InjectMockKs
    private lateinit var useCase: GetTripDetailsUseCase

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
    }

    @Test
    fun `should get the list of stops in the trip selected by customer `() = runTest {
        val expectedListOfStops = listOf(
            BusStop(
                id = 2,
                departure = Schedule(
                    scheduled = "2024-11-12T14:05:00Z",
                    actual = "2024-11-12T14:06:00Z",
                    estimated = "2024-11-12T14:05:00Z"
                ),
                arrival = Schedule(
                    scheduled = "2024-11-12T14:15:00Z",
                    actual = "2024-11-12T14:16:00Z",
                    estimated = "2024-11-12T14:15:00Z"
                ),
                location = Location(
                    id = 2,
                    type = "Station",
                    name = "bus stop 2",
                    regionName = "Region B",
                    code = "MS",
                    codeDetail = "Middle Station Code",
                    detailedName = "Middle Station Detailed",
                    localName = "Middle",
                    lon = -1.2234,
                    lat = 52.2234,
                    googlePlaceId = "middle_google_place_id",
                    atcoCode = "ATCO002",
                    timezone = "GMT",
                    zone = zone,
                    heading = 0.0,
                    areaId = 1
                ),
                allowBoarding = true,
                allowDropOff = true,
                bookingCutOffMins = 10,
                preBookedOnly = false,
                skipped = false
            ),
            BusStop(
                id = 3,
                departure = Schedule(
                    scheduled = "2024-11-12T14:20:00Z",
                    actual = "2024-11-12T14:21:00Z",
                    estimated = "2024-11-12T14:20:00Z"
                ),
                arrival = Schedule(
                    scheduled = "2024-11-12T14:40:00Z",
                    actual = "2024-11-12T14:41:00Z",
                    estimated = "2024-11-12T14:40:00Z"
                ),
                location = Location(
                    id = 3,
                    type = "Station",
                    name = "bus stop 3",
                    regionName = "Region C",
                    code = "DS",
                    codeDetail = "Destination Station Code",
                    detailedName = "Destination Station Detailed",
                    localName = "Destination",
                    lon = -1.3234,
                    lat = 52.3234,
                    googlePlaceId = "destination_google_place_id",
                    atcoCode = "ATCO003",
                    timezone = "GMT",
                    zone = zone,
                    heading = 0.0,
                    areaId = 1
                ),
                allowBoarding = true,
                allowDropOff = true,
                bookingCutOffMins = 10,
                preBookedOnly = false,
                skipped = false
            ),
            BusStop(
                id = 4,
                departure = Schedule(
                    scheduled = "2024-11-12T14:20:00Z",
                    actual = "2024-11-12T14:21:00Z",
                    estimated = "2024-11-12T14:20:00Z"
                ),
                arrival = Schedule(
                    scheduled = "2024-11-12T14:40:00Z",
                    actual = "2024-11-12T14:41:00Z",
                    estimated = "2024-11-12T14:40:00Z"
                ),
                location = Location(
                    id = 4,
                    type = "Station",
                    name = "bus stop 4",
                    regionName = "Region C",
                    code = "DS",
                    codeDetail = "Destination Station Code",
                    detailedName = "Destination Station Detailed",
                    localName = "Destination",
                    lon = -1.3234,
                    lat = 52.3234,
                    googlePlaceId = "destination_google_place_id",
                    atcoCode = "ATCO003",
                    timezone = "GMT",
                    zone = zone,
                    heading = 0.0,
                    areaId = 1
                ),
                allowBoarding = true,
                allowDropOff = true,
                bookingCutOffMins = 10,
                preBookedOnly = false,
                skipped = false
            ),
            BusStop(
                id = 5,
                departure = Schedule(
                    scheduled = "2024-11-12T14:20:00Z",
                    actual = "2024-11-12T14:21:00Z",
                    estimated = "2024-11-12T14:20:00Z"
                ),
                arrival = Schedule(
                    scheduled = "2024-11-12T14:40:00Z",
                    actual = "2024-11-12T14:41:00Z",
                    estimated = "2024-11-12T14:40:00Z"
                ),
                location = Location(
                    id = 5,
                    type = "Station",
                    name = "bus stop 5",
                    regionName = "Region C",
                    code = "DS",
                    codeDetail = "Destination Station Code",
                    detailedName = "Destination Station Detailed",
                    localName = "Destination",
                    lon = -1.3234,
                    lat = 52.3234,
                    googlePlaceId = "destination_google_place_id",
                    atcoCode = "ATCO003",
                    timezone = "GMT",
                    zone = zone,
                    heading = 0.0,
                    areaId = 1
                ),
                allowBoarding = true,
                allowDropOff = true,
                bookingCutOffMins = 10,
                preBookedOnly = false,
                skipped = false
            )
        )
        val quote = Quote(
            availability = Availability(
                seat = 10,
                wheelchair = 2,
                bicycle = 1
            ),
            prices = Prices(
                adult = 20,
                child = 10,
                youngChild = 5,
                concession = 15,
                seat = 5,
                wheelchair = 0,
                bicycle = 2
            ),
            legs = listOf(
                createDummyLeg(
                    origin = createDummyStop(id = 2, name = "bus stop 2"),
                    destination = createDummyStop(id = 5, name = "bus stop 5"),
                    tripUid = "trip_001"
                )
            ),
            bookable = true
        )
        coEvery { repository.getAllTrips() } returns createDummyQuotes()
        coEvery { repository.getRouteDetails(quote.legs[0].tripUid) } returns dummyTrip

        val actualListOfStops = useCase(quote)

        assertEquals(
            expectedListOfStops, actualListOfStops
        )
    }
}
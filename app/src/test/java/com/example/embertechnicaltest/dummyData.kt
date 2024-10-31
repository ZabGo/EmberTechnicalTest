package com.example.embertechnicaltest

import com.example.embertechnicaltest.data.model.Amenities
import com.example.embertechnicaltest.data.model.Availability
import com.example.embertechnicaltest.data.model.Leg
import com.example.embertechnicaltest.data.model.Location
import com.example.embertechnicaltest.data.model.Prices
import com.example.embertechnicaltest.data.model.Quote
import com.example.embertechnicaltest.data.model.BusStop
import com.example.embertechnicaltest.data.model.Description
import com.example.embertechnicaltest.data.model.Schedule
import com.example.embertechnicaltest.data.model.Stop
import com.example.embertechnicaltest.data.model.Trip
import com.example.embertechnicaltest.data.model.Vehicle
import com.example.embertechnicaltest.data.model.VehicleDescription
import com.example.embertechnicaltest.data.model.Zone


val zone = listOf(Zone(latitude = 0.0, longitude = 0.0))
val dummyTrip = Trip(
    route = listOf(
        BusStop(
            id = 1,
            departure = Schedule(
                scheduled = "2024-11-12T14:00:00Z",
                actual = "2024-11-12T14:05:00Z",
                estimated = "2024-11-12T14:03:00Z"
            ),
            arrival = Schedule(
                scheduled = "2024-11-12T14:30:00Z",
                actual = "2024-11-12T14:28:00Z",
                estimated = "2024-11-12T14:29:00Z"
            ),
            location = Location(
                id = 1,
                type = "Station",
                name = "bus stop 1",
                regionName = "Region A",
                code = "OS",
                codeDetail = "Origin Station Code",
                detailedName = "Origin Station Detailed",
                localName = "Origin",
                lon = -1.1234,
                lat = 52.1234,
                googlePlaceId = "origin_google_place_id",
                atcoCode = "ATCO001",
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
        ),
        BusStop(
            id = 6,
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
                id = 6,
                type = "Station",
                name = "bus stop 6",
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
            id = 7,
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
                id = 7,
                type = "Station",
                name = "bus stop 7",
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
    ), vehicle = Vehicle(
        wheelchair = 1,
        bicycle = 0,
        seat = 40,
        id = 102,
        name = "Bus B",
        hasWifi = false,
        hasToilet = true,
        isBackupVehicle = true
    ),
    description = Description(
        routeNumber = "102",
        patternId = 2,
        calendarDate = "2024-11-12",
        type = "Holiday",
        isCancelled = true,
        routeId = 1002
    )
)

fun createDummyQuotes(): List<Quote> {
    return listOf(
        Quote(
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
        ), Quote(
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
                    origin = createDummyStop(id = 3, name = "bus stop 3"),
                    destination = createDummyStop(id = 7, name = "bus stop 7"),
                    tripUid = "trip_001"
                )
            ),
            bookable = true
        ), Quote(
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
                    destination = createDummyStop(id = 6, name = "bus stop 6"),
                    tripUid = "trip_001"
                )
            ),
            bookable = true
        )
    )
}

fun createDummyLeg(origin: Stop, destination: Stop, tripUid: String): Leg {
    return Leg(
        type = "bus",
        tripUid = tripUid,
        addsCapacityForTripUid = null,
        origin = origin,
        destination = destination,
        departure = Schedule(
            scheduled = "2024-11-12T14:00:00Z",
            actual = "2024-11-12T14:05:00Z",
            estimated = "2024-11-12T14:03:00Z"
        ),
        arrival = Schedule(
            scheduled = "2024-11-12T14:30:00Z",
            actual = "2024-11-12T14:28:00Z",
            estimated = "2024-11-12T14:29:00Z"
        ),
        description = VehicleDescription(
            brand = "Brand A",
            operator = "Operator X",
            destinationBoard = "Destination Station",
            numberPlate = "XYZ 1234",
            vehicleType = "Bus",
            colour = "Red",
            amenities = Amenities(
                true,
                true
            ), // Assuming amenities can be represented as a list of strings
            isElectric = false
        ),
        tripType = "direct"
    )
}

fun createDummyStop(id: Int, name: String): Stop {
    return Stop(
        id = id,
        atcoCode = "ATCO${
            id
        }",
        detailedName = "$name Detailed",
        lat = 52.1234 + id * 0.1, // Slight variation in latitude
        lon = -1.1234 - id * 0.1, // Slight variation in longitude
        name = name,
        regionName = "Region ${('A' + id)}",
        type = "Station",
        code = "CODE$id",
        codeDetail = "Detail Code $id",
        timezone = "GMT",
        heading = 0,
        zone = listOf(createDummyZone()),
        areaId = 1,
        locationTimeId = 1,
        bookingCutOffMins = 10,
        preBookedOnly = false,
        skipped = false,
        bookable = "yes"
    )
}

fun createDummyZone(): Zone {
    return Zone(
        latitude = 52.1234,
        longitude = -1.1234
    )
}


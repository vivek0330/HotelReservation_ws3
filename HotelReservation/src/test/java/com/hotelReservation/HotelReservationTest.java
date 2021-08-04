package com.hotelReservation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {
    @Test
    public void whenHotelAddedToSystemShouldGetAdded() {
        Hotel hotel1 = new Hotel("Lakeewood", 110, 90, 80, 80, 3);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
        Hotel[] hotelList = {hotel1, hotel2, hotel3}; // creating array
        List<Hotel> hotels = Arrays.asList(hotelList); // asList method is used to return a fixed size list and  getting the list view of Array
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add(hotel1); // call add method
        hotelReservation.add(hotel2); // call add method
        hotelReservation.add(hotel3); // call add method
        List<Hotel> result = hotelReservation.getHotelList(); // call getHotelList method
        assertEquals(hotels, result); // I want to test equality of two objects
    }
}

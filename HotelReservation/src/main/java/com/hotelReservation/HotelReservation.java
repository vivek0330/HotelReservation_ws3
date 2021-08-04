package com.hotelReservation;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Hotel Reservation Program</h1>
 * <p>Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer…</p>
 *
 * @author vivek kumar
 * @version 1.0
 * @since 2021-08-03
 */
public class HotelReservation {

    /**
     * <p><b> List --> </b>List in Java provides the facility to maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements.</p>
     * Creating a List of type Hotel using ArrayList
     */
    private final List<Hotel> hotels;

    public HotelReservation() {
        this.hotels = new ArrayList<Hotel>();
    }

    /**
     * <p><b>Add --></b>It is used to insert the specified element at the specified position in a list.</p>
     * create a add method with the specified name
     *
     * @param hotel
     */
    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}

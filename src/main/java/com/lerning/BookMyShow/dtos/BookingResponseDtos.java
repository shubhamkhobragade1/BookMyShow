package com.lerning.BookMyShow.dtos;

import com.lerning.BookMyShow.models.Booking;
import com.lerning.BookMyShow.services.BookingService;

public class BookingResponseDtos {

    private ResponseStatus status;
    private Booking booking;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}

package com.lerning.BookMyShow.controllers;

import com.lerning.BookMyShow.dtos.BookingRequestDtos;
import com.lerning.BookMyShow.dtos.BookingResponseDtos;
import com.lerning.BookMyShow.exceptions.SeatNotAvailableExceptions;
import com.lerning.BookMyShow.exceptions.ShowNotFoundExceptions;
import com.lerning.BookMyShow.exceptions.UserNotFoundExceptions;
import com.lerning.BookMyShow.models.Booking;
import com.lerning.BookMyShow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;
    public BookingResponseDtos bookTicket(BookingRequestDtos request) throws ShowNotFoundExceptions, UserNotFoundExceptions, SeatNotAvailableExceptions {
        BookingResponseDtos response=new BookingResponseDtos();

        try {
            Booking booking =bookingService.bookTicket(request.getBookingId(),request.getShowSeatIds(),request.getUserId(),request.getShowId());
            response.
        }catch (Exception e){

        }


        return response;
    }


}

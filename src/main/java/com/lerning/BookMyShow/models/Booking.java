package com.lerning.BookMyShow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel{

    private BookingStatus bookingStatus;
    private List<ShowSeat> showSeatList;
    private int amount;
    private List<Payment> paymentList;
    private User user;
}

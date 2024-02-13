package com.lerning.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{

    private BookingStatus bookingStatus;
    // b:s  1:m   1:1
    @OneToMany
    private List<ShowSeat> showSeatList;
    private int amount;
    // b:p  1:m  1:1

    @OneToMany
    private List<Payment> paymentList;
    // b:u  1:1  , m:1
    @ManyToOne  // one user can hv many booking but one booking only hv one user
    private User user;
}

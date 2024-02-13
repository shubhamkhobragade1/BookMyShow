package com.lerning.BookMyShow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatPrice extends BaseModel{
    private int price;
    // ssp:st  1:1  , m:1

    @ManyToOne
    private SeatType seatType;
    // ssp:sw 1:1    m:1
    @ManyToOne
    private Show show;

}

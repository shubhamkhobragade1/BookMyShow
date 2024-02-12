package com.lerning.BookMyShow.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatPrice extends BaseModel{
    private int price;
    private SeatType seatType;
    private Show show;

}

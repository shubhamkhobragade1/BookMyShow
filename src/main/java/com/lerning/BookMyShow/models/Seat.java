package com.lerning.BookMyShow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{

    private String seatNum;
    private SeatType seatType;
    private int row;
    private int col;

}

package com.lerning.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private String seatNum;
    @ManyToOne
    private SeatType seatType;
    private int row;
    private int col;

    // below attribute is because screen has seat list
    @ManyToOne
    private Screen_Audo screenAudo;

}

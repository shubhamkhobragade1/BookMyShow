package com.lerning.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    // sst:sw  1:1  m:1
    @ManyToOne
    private Show show;
    // sst:st   1:1  m:1
    @ManyToOne
    private Seat seat;
    private ShowSeatStatus showSeatStatus;


}

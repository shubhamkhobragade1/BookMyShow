package com.lerning.BookMyShow.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SeatType extends BaseModel {
    private String name;  // it will b enum/ just for learning changed to class
    // so that user input
//    SILVER,
//    GOLD,
//    PLATINUM
}

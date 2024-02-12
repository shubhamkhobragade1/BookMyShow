package com.lerning.BookMyShow.models;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen_Audo extends BaseModel{

    private String name;
    private List<Seat> seatsList;

    private List<Features> featuresList;

}

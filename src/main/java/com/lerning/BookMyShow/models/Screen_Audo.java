package com.lerning.BookMyShow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen_Audo extends BaseModel{

    private String name;
    @OneToMany
    private List<Seat> seatsList;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> featuresList;

}

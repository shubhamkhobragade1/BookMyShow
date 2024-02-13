package com.lerning.BookMyShow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    // s:m 1:1  m:1

    @ManyToOne
    private Movie movie;
    // 1 sh:s  1:1  m:1
    @ManyToOne
    private Screen_Audo screenAudo;
    private Date startTime;
    private Date endTime;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> featuresList;

}

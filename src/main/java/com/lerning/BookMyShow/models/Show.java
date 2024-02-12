package com.lerning.BookMyShow.models;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel{
    private Movie movie;
    private Screen_Audo screenAudo;
    private Date startTime;
    private Date endTime;
    private List<Features> featuresList;

}

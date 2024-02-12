package com.lerning.BookMyShow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
public class Thetre extends BaseModel{

    private String name;
    private List<Screen_Audo> screenAudoList;

    private City city;
}

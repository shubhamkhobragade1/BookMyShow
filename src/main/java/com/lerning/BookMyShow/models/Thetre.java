package com.lerning.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
@Entity
public class Thetre extends BaseModel{

    private String name;
    // t:s  1:m   1:1
    @OneToMany
    private List<Screen_Audo> screenAudoList;
    // t:c  1:1  m:1
    @ManyToOne
    private City city;
}

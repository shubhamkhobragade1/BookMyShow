package com.lerning.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="Users")
public class User extends BaseModel {

    private String name;
    private String email;
    private String pass;
    // u:B  1:M   1:m
    @OneToMany
    private List<Booking> bookingList;
}

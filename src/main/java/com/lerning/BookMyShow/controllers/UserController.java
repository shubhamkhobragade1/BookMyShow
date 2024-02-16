package com.lerning.BookMyShow.controllers;

import com.lerning.BookMyShow.dtos.SignUpRequestDto;
import com.lerning.BookMyShow.dtos.SignUpResponseDto;
import com.lerning.BookMyShow.models.User;
import com.lerning.BookMyShow.services.UserService;

public class UserController {

    private UserService userService;
    private SignUpResponseDto signUp(SignUpRequestDto request){

        SignUpResponseDto response=new SignUpResponseDto();

        try{
            User user=userService.signUp(request.getEmail(),request.getPassword());
        }

    }

}

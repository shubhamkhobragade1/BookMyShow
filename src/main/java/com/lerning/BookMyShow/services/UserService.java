package com.lerning.BookMyShow.services;

import com.lerning.BookMyShow.daos.UserDao;
import com.lerning.BookMyShow.exceptions.UserAlreadyExistExceptions;
import com.lerning.BookMyShow.models.User;

import java.util.Optional;

public class UserService {

    private UserDao userDao;
    public User signUp(String email, String password)  {

        Optional<User> userOptional=userDao.findByEmail(email);

        if (userOptional.isEmpty()){
            User user=new User();
            user.setEmail(email);
            user.setPass(password); // password we generally not store as it is
            User savedUser=userDao.save(user);
            return savedUser;
        }else {
            // redirect to sign in page is already exist
        }


    }

    public User signIn(String mail,String pass){
        return null;
    }


}

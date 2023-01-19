package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivityUser;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.User;

public class UserController {
    private UserWS model;
    private MainActivityUser view;

    public UserController(UserWS model, MainActivityUser view){
        this.model = model;
        this.view = view;
    }

    public void getUser(){
        User user = model.getUserWS();
        model.getUser();
    }
    // THREADS -> RETROFIT 2

    // IRÍA A WEBSERVICE REST + COGERÍA DATA STUDENT + Y VOLVERÍA

    /*public void updateView(){
        view.printStudentDetails(model.getName(), model.getSurname());
    }*/
}

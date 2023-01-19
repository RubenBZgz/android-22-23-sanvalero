package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivity;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class StudentController {
    private StudentWS model;
    private MainActivity view;

    public StudentController(StudentWS model, MainActivity view){
        this.model = model;
        this.view = view;
    }

    public void getStudent(){
        Student student = model.getStudentWS();
        model.getStudent();
    }
    // THREADS -> RETROFIT 2

    // IRÍA A WEBSERVICE REST + COGERÍA DATA STUDENT + Y VOLVERÍA

    /*public void updateView(){
        view.printStudentDetails(model.getName(), model.getSurname());
    }*/
}

package com.example.mvc_netflix_1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvc_netflix_1.controller.UserController;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.User;

public class MainActivityUser extends AppCompatActivity {
    private UserController controller;
    private MainActivityUser view;
    private UserWS model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CARGAR VIEW
        view = this;
        // MODEL + VIEW
        controller = new UserController(model, view);
        // CASO DE USO -> OBTENER ESTUDIANTE CON MVC
        controller.getUser();


    }

    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnEnviar;

    private void initComponents(){
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtPassword = (EditText)findViewById(R.id.edtPasswd);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();

                model.setUserWS2(email,password);

            }
        }
        );
    }

    public void printUserDetails(User user){
        Log.d("MainActivity - NAME",user.getEmail());
        Log.d("MainActivity - SURNAME",user.getPassword());
    }

}
package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class regster extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<>();

    EditText user;
    EditText user2;
    EditText pass;
    EditText email;
    EditText phone;
    EditText city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regster);

         user = findViewById(R.id.e1);
         user2= findViewById(R.id.e2);
         pass= findViewById(R.id.e3);
         email= findViewById(R.id.e4);
         phone= findViewById(R.id.e5);
         city= findViewById(R.id.e6);


    }

    public void insert(View view) {
        User newuser = new User (user.getText().toString(),user2.getText().toString(),pass.getText().toString(),email.getText().toString()
                ,phone.getText().toString(),city.getText().toString());
    }
}
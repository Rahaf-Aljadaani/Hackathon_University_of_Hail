package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Products extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products2);
    }


    public void page1(View view){
        Intent intent = new Intent(Products.this, products2.class);
        startActivity(intent);
        finish();
    }

    public void ll(View view){
        Intent intent = new Intent(Products.this, page1.class);
        startActivity(intent);
        finish();
    }

    public void page4(View view){
        Intent intent = new Intent(Products.this, firstframe.class);
        startActivity(intent);
        finish();
    }

    public void profile(View view){
        Intent intent = new Intent(Products.this, login1.class);
        startActivity(intent);
        finish();
    }

    public void home(View view){
        Intent intent = new Intent(Products.this, firstframe.class);
        startActivity(intent);
        finish();
    }

    public void basket(View view){
        Intent intent = new Intent(Products.this, basket1.class);
        startActivity(intent);
        finish();
    }


    public void chat(View view){
        Intent intent = new Intent(Products.this, farme.class);
        startActivity(intent);
        finish();
    }
}
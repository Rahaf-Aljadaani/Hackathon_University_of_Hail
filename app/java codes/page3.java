package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void profile(View view){
        Intent intent = new Intent(page3.this, login1.class);
        startActivity(intent);
        finish();
    }

    public void home(View view){
        Intent intent = new Intent(page3.this, firstframe.class);
        startActivity(intent);
        finish();
    }
    public void page3(View view){
        Intent intent = new Intent(page3.this, Products.class);
        startActivity(intent);
        finish();
    }


    public void basket(View view){
        Intent intent = new Intent(page3.this, basket1.class);
        startActivity(intent);
        finish();
    }


    public void chat(View view){
        Intent intent = new Intent(page3.this, farme.class);
        startActivity(intent);
        finish();
    }

}
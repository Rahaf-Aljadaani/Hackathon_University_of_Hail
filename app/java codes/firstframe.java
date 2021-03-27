package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firstframe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstframe);
    }


    public void page1(View view){

                Intent intent = new Intent(firstframe.this, Products.class);
                startActivity(intent);
                finish();
    }

    public void page2(View view){
        Intent intent = new Intent(firstframe.this, products2.class);
        startActivity(intent);
        finish();
    }

    public void page3(View view){
        Intent intent = new Intent(firstframe.this, products2.class);
        startActivity(intent);
        finish();
    }

    public void profile(View view){
        Intent intent = new Intent(firstframe.this, login1.class);
        startActivity(intent);
        finish();
    }

    public void home(View view){
        Intent intent = new Intent(firstframe.this, firstframe.class);
        startActivity(intent);
        finish();
    }



    public void basket(View view){
        Intent intent = new Intent(firstframe.this, basket1.class);
        startActivity(intent);
        finish();
    }


    public void chat(View view){
        Intent intent = new Intent(firstframe.this, farme.class);
        startActivity(intent);
        finish();
    }

}
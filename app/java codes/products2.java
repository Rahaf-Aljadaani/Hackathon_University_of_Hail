package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class products2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }
    public void page4(View view){
        Intent intent = new Intent(products2.this, firstframe.class);
        startActivity(intent);
        finish();
    }

    public void ll(View view){
        Intent intent = new Intent(products2.this, page3.class);
        startActivity(intent);
        finish();
    }
    public void page1(View view){
        Intent intent = new Intent(products2.this, products2.class);
        startActivity(intent);
        finish();
    }

    public void addbusket(View view) {

        //Add to static list busket
    }



    public void profile(View view){
        Intent intent = new Intent(products2.this, login1.class);
        startActivity(intent);
        finish();
    }

    public void home(View view){
        Intent intent = new Intent(products2.this, firstframe.class);
        startActivity(intent);
        finish();
    }

    public void basket(View view){
        Intent intent = new Intent(products2.this, basket1.class);
        startActivity(intent);
        finish();
    }

    public void chat(View view){
        Intent intent = new Intent(products2.this, farme.class);
        startActivity(intent);
        finish();
    }
}